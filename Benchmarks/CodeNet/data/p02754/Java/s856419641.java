import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();//blue
        int r = sc.nextInt();//red
        int sum = n/(a+r);
        int amari = n%(a+r);

        if(amari<=a){
            System.out.println(a*sum+amari);
        }else{
            System.out.println(a*sum);
        }
        

    }
}
