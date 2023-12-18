

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long ans=(n/(long)500);
        ans=(long)((long)ans*(long)1000);
        long ss=((n%(long)500)/(long)5);
        ss=(long)((long)ss*(long)5);
        ans+=ss;
        System.out.println(ans);

    }

}
