import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long multi = 1L;
        
        for(int i=0; i<N; i++){
            long a = sc.nextLong();
            multi *= a;
        }
        
        
        if(multi >= Math.pow(10,18)){
            System.out.println(-1);
        }else{
            System.out.println(multi);
        }
    }
}