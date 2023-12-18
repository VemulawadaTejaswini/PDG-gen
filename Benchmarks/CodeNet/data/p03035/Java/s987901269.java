
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int k;

        if(a>13){
            k=b;
        }else if(a<=6){
            k=b/2;
        }else{
            k=0;
        }

        System.out.println(k);

    }
}