import java.util.*;

public class Main{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int N=0;
     int K=0;
     N=sc.nextInt();
     K=sc.nextInt();
     ArrayList<Integer> num = new ArrayList<Integer>();
     int min=0;
        min=Math.abs(N-K);
     int count=0;
     for(int i=0;i<N-1;i++){
        num.add(Math.abs(min-K));
        if(min>num.get(i))
        min=num.get(i);
     }
     System.out.println(min);
    }
}