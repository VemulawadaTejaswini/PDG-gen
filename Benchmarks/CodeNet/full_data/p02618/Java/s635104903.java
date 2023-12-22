import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int[] ci = new int[26];
        ContestTuple[] cTuples = new ContestTuple[26];
        int[][] sdi = new int[d][26];
        for(int i=0; i<26; i++) {
            ci[i] = in.nextInt();
            ContestTuple tuple = new ContestTuple(d);
            tuple.type = i;
            tuple.c = ci[i];
            cTuples[i] = tuple;
        }
        for(int day=0; day<d; day++) {
            for(int i=0; i<26; i++) {
                sdi[day][i] = in.nextInt();
                cTuples[i].sd[day] = sdi[day][i];
            }
        }
        
        // 初日からの経過時間とcの大きさで判断するPriorityQueue
        PriorityQueue<ContestTuple> queue = new PriorityQueue<>(26);
        for(int i=0; i<26; i++) {
            cTuples[i].queuedDate = 0;
            queue.add(cTuples[i]);
        }
        for(int day=0; day<d; day++) {
            ContestTuple tuple = queue.poll();
            System.out.println(tuple.type+1);
            tuple.queuedDate = day+1;
            queue.add(tuple);
        }
    }
}

class ContestTuple {
    int type;
    int c;
    int[] sd;
    int queuedDate;
    
    public ContestTuple(int d) {
        this.sd = new int[d];
    }
}

class ContestComparator implements Comparator<ContestTuple> {
    @Override
    public int compare(ContestTuple o1, ContestTuple o2) {
        return (o1.queuedDate - o1.c) - (o2.queuedDate - o2.c);
    }
}
