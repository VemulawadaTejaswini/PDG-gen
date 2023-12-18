import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        
        for(int i=0;i<M;i++){
            N-=sc.nextInt();
        }
        
        System.out.println(N);
    }
}
