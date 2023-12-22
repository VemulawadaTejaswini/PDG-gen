import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();

        if(x[0]<x[1] && x[1] < x[2]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
