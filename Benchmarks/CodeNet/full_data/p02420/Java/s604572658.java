import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            if(s.equals("-")) break;
            int n = sc.nextInt();
            int cnt = 0,h,l=s.length();
            for(int i=0;i<n;i++){
                h = sc.nextInt();
                cnt += h;
            }
            char[] s_ch = new char[s.length()];
            for(int i=0;i<l;i++){
                s_ch[i] = s.charAt((cnt+i)%l);
                System.out.print(s_ch[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}
