import java.util.ArrayList;
import java.util.*;
//import java.lang.*;
import java.util.regex.*;
 class Main{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        int N=sc.nextInt();
        int K=sc.nextInt();
        for(int i=0;i<N;i++){
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        int sum=0;
        for(int i=0;i<K;i++){
            sum+=l.get(i);
        }
        System.out.println(sum);
    }
}