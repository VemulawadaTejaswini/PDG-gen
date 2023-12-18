import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if((A-B)/2==(double)(A-B)/2){
            if(A>=B){
                System.out.println(A-(A-B)/2);
            }
            if(A<B){
                System.out.println(B-(B-A)/2);
            }
        }
        else{
            System.out.println("IMPOSSIBLE");
        }
    }
}