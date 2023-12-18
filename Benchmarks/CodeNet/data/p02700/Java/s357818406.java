import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        while((C > 0) && (A > 0)){
            C -= B;
            if (C > 0){
            A -= D;
            }
        }

        if (A > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}