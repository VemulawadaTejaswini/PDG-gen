import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        int x = stdIn.nextInt();
        String y = stdIn.next();
        int ans=0;
        int a,b,c;
        char aa,bb,cc;
        for(a=1;a<=x;a++){
            for(b=1;b<=x;b++){
                if(a>=b)continue;
                for(c=1;c<=x;c++){
                    if(b>=c)continue;
                    aa=y.charAt(a-1);
                    bb=y.charAt(b-1);
                    cc=y.charAt(c-1);
                    if(b-a==c-b)continue;
                //    System.out.println(a+""+b+""+c);
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}
