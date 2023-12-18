
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h=in.nextInt();
        int a=in.nextInt();
        int ans=h/a;
        if(h%a==0)
            System.out.println(ans);
        else{
            ans++;
            System.out.println(ans);
        }

    }
}
