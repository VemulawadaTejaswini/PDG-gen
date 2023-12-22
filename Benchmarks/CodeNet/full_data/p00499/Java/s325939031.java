import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L, A, B, C, D;
        L = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        if(Math.ceil(A / C) > Math.ceil(B / D)){
        	System.out.println((int)(L - Math.ceil(A / C)));
        }else{
        	System.out.println((int)(L - Math.ceil(B / D)));
        }
    }
}