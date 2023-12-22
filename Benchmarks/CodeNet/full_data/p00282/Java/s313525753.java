import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] r = "Man:Oku:Cho:Kei:Gai:Jo:Jou:Ko:Kan:Sei:Sai:Gok:Ggs:Asg:Nyt:Fks:Mts".split(":");
        for (;;) {
            int n = sc.nextInt(), m = sc.nextInt();
            if ((n | m) == 0) {
                break;
            }
            String b = new BigInteger(n + "").pow(m).toString();
            int s=4-b.length()%4;
            while(s-->0) {
                b="0"+b;
            }
            int l = (b.length() / 4)-2;
            for (int i = 0; i < b.length()-4; i += 4) {
                int a=Integer.parseInt(b.substring(i, i+4));
                System.out.print(a>0?a+r[l--]:"");
            }
          int c=Integer.parseInt(b.substring(b.length()-4,b.length()));
          System.out.println(c>0?c:"");
        }
    }
}
