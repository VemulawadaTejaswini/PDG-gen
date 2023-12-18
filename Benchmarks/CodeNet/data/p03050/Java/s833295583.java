import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong();
        long total=0;
        for(int i=1; i<N/2; i++){
            if((N-i)/i<i){
                break;
            }
            if((N-i)%i==0){
                total+=(N-i)/i;
            }
        }
        System.out.println(total);
    }
}
