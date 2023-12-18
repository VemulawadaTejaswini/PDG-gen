import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        boolean flag = true;
        while(flag){
            C=C-B;
            A=A-D;
            if(C<=0 || A<=0){
                flag = false;
            }
        }
        if(C<=0) System.out.println("Yes");
        else System.out.println("No");
    }
}