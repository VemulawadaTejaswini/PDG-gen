import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        sc.close();
        if(d==0) {
            if(n==100) n++;
            System.out.println(n);
        }
        else if(d==1) {
            System.out.println(n*100);
        }
        else {
            System.out.println(n*10000);
        }
    }
}