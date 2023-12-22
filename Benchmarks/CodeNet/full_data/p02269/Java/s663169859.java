import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] aaa){
        Scanner s = new Scanner(System.in);
        Set<Integer> hset = new HashSet<Integer>();
        int n,q,i,count=0;
        n = s.nextInt();
        for(i=0;i<n;i++)hset.add(s.nextInt());
        q = s.nextInt();
        for(i=0;i<q;i++)if(hset.contains(s.nextInt()))count++;
        System.out.println(count);
    }
}
