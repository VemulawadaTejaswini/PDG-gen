import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    n %= 1000;
    if(n==0||n==1000) {
        System.out.println(0);
    }
    else{
        System.out.println(1000-n);
    }
}