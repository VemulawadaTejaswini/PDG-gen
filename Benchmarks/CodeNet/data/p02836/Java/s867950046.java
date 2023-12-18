
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String[] B = A.split("");

        int count = 0;

        for(int i=0; i<(B.length/2); i++){
            if(B[i] != B[B.length-1]){
                count++;
            }else{
                // Nothing
            }
        }
        System.out.println(count);
    }
}