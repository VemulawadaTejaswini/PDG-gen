import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int cnt=0;
        if(a!=b)
            cnt++;
        if(b!=c)
            cnt++;
        if(c!=a)
            cnt++;
        System.out.println(cnt);
    }
}
