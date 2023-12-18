import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A==7 & B==5 & C==5){
            System.out.print("YES");
        }if (A==5 & B==7 & C==5){
            System.out.print("YES");
        }if (A==5 & B==5 & C==7) {
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

    }
    }

