import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A=sc.nextInt();
        int x=N%100;
        int y=N-x;
        if (y%500==0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}