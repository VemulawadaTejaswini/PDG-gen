import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d=a/b,r=a%b;
        double f=(double)a/(double)b;

        System.out.println(d+" "+r+" "+f);
        sc.close();
    }
}
