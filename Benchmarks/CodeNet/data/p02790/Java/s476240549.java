import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        String A = b1;
        String B = a1;

        for(int i=1; i<a; i++){
            A = A + b1;
        }
        for(int i=1; i<b; i++){
            B = B + a1;
        }
        int A1 = Integer.parseInt(A);
        int B1 = Integer.parseInt(B);
        if(A1<=B1){
            System.out.println(B);
        }
        else{
            System.out.println(A);
        }
    }
}