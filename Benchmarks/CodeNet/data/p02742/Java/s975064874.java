import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();
        long W = sc.nextLong();

        if(W%2==0){
            System.out.println(W / 2 * H);
        }
        else{
            if(H%2==0){
                System.out.println(W * (H / 2));
            }
            else{
                System.out.println(W * (H / 2) + W / 2 + 1);
            }
        }
    }
}