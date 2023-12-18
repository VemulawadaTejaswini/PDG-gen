import java.util.*;
public class Main {
    public static void main(String[]args){
        // 標準入力
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A <= 9 && B <= 9)  System.out.println(9*9);
        else System.out.println(-1);
    }   
       
}       