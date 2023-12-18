import java.util.*;
import java.io.*;

public class Main {
    static void answer(LinkedList<Long> list){
        int i=0;
        for(long e:list){
            System.out.print(e);
            i++;
            if(i<list.size()) System.out.print(" ");
            else System.out.println();
        }
        System.exit(0);
    }
    static LinkedList<Long> simulate(LinkedList<Long> initial, long[] A, int startIndex){
        for(int n=startIndex; n<A.length; n++){
            if(!initial.contains(A[n])) initial.addLast(A[n]);
            else while(initial.contains(A[n])){
                initial.removeLast();
            }
        }
        return initial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n] = sc.nextLong();

        Map<Long, Long> jump = new HashMap<>();
        {
            Map<Long, Long> lastAppear = new HashMap<>();
            for(int n=0; n<N*2; n++){
                if(lastAppear.containsKey(A[n%N])){
                    jump.putIfAbsent(lastAppear.get(A[n%N]), (long)n);
                }
                lastAppear.put(A[n%N], (long)(n%N));
            }
        }

        long current = 0;
        Map<Long, Long> visited = new HashMap<>();
        visited.put(0L,0L);
        while(current < N*K){
            long curIndex = current%N;
            long next = current - curIndex + jump.get(curIndex) + 1;
            if(next >= N*K) answer(simulate(new LinkedList<>(), A, (int)curIndex));
            if(visited.containsKey(next%N)){
                long period = next - visited.get(next%N);
                long circ = (N*K-next)/period;
                next += period * circ;
            }
            current = next;
        }
    }
}