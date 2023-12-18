import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        s.nextLine();
        b=s.nextInt();
        s.nextLine();
        c=s.nextInt();
        s.nextLine();
        if((a==b && b!=c)||(b==c && c!=a)||(a==c&&c!=b)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}