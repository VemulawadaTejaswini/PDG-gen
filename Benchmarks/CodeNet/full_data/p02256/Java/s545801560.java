import java.util.Scanner;

public class Main {
   static int gcd(int a,int b){
        if(a%b==0)return b;
       else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=gcd(a,b);
        System.out.println(x);
        sc.close();
      
    }
}

