import java.util.*;

public class Main{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     long N=0;
     long K=0;
     N=sc.nextLong();
     K=sc.nextLong();
     ArrayList<Long> num = new ArrayList<Long>();
     long min=0;
        min=Math.abs(N-K);
     long count=0;
     for(int i=0;i<N-1;i++){
        num.add(Math.abs(min-K));
        if(min>num.get(i))
        min=num.get(i);
     }
     System.out.println(min);
    }
}