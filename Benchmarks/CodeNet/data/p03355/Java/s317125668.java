import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int N = s.length();
        int K = scan.nextInt();
        TreeSet<String> ts = new TreeSet<>();
        for(int i=0;i<N;++i){
            for(int j=i+1;j<=N;++j)ts.add(s.substring(i, j));
        }
        Iterator itr = ts.iterator();
        while(--K>0)itr.next();
        System.out.println(itr.next());
    }
}