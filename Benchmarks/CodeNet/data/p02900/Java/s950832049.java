import java.util.*;
import java.util.concurrent.CountDownLatch;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 1;
            for(int i = 2; i <= Math.max(A,B); i++){
                boolean a = false;
                if(A%i == 0 && B%i == 0) a = true;
                if(a == true){
                    boolean b = true;
                    for(int x = 2; x < i; x++){
                        if(i%x == 0) b = false;
                        break;
                    }
                    if(b == true) count++;
                } 
            }
System.out.print(count);

    }
}
