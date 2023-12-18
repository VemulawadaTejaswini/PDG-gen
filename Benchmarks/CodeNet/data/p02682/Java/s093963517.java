mport java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        sc.close();
        if(a>=k){
            System.out.println(k);
            return;
        }
        if(a+b>=k){
            System.out.println(a);
            return;
        }
        sum = k - a - b;
        System.out.println(a-sum); 
    }
}