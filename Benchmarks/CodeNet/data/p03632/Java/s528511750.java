import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if(B<C){
            System.out.println(0);
        }
        else{
            if(B>D && A<C){
                System.out.println(D - C);
            }
            else if(D>B && C<A){
                System.out.println(B - A);
            }
            else if(B>C && B<D && A<C){
                System.out.println(B - C);
            }
            else{
                System.out.println(D - A);
            }
        }
    }
}