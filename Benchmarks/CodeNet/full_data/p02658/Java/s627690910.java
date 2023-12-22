import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        long x=Long.parseLong("1000000000000000000");
        long sum=1;
        long dd=0;
        for(int i=0;i<N;i++){
            long A = Long.parseLong(scan.next());
            if(A==0){
                System.out.println(0);
                System.exit(0);
            }
            if(sum>x){
                dd=-1;
            }
            sum*=A;
        }
        if(dd==-1){
            System.out.println(dd);
        }else{
         System.out.println(sum);   
        }
    }
}
