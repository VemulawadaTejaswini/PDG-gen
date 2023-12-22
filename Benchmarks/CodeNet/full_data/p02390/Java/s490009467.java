import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),h = n / 3600,m = n % 3600 / 60,s = n % 60;
        System.out.printf("%d:%d:%d\n",h,m,s);
        sc.close();
    }

}