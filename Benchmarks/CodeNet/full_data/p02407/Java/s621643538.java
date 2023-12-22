import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = n - 1; i >= 0; i--){
            int num = sc.nextInt();
            a[i] =  num;
        }
        for(int j : a){
            System.out.print(j);
            System.out.print(" ");
        }
}
}