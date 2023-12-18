import java.util.*;

public class Main{
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long N=0;
        long K=0;
        N=sc.nextInt();
        K=sc.nextInt();
        long T=0;
        T=N%K;
        long min=0;
        
        if(min>Math.abs(K-T)){
            min = Math.abs(K-T);
        }
        System.out.println(min);
    }
}

