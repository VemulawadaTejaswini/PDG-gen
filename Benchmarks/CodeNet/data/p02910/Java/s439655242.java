import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String x=in.next();
        int n=x.length();
        int o=0,e=0;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                if(x.charAt(i)=='U'||x.charAt(i)=='R'||x.charAt(i)=='D')o++;
            }
            else    if(x.charAt(i)=='U'||x.charAt(i)=='L'||x.charAt(i)=='D')e++;
        }
        if(n%2==0){
            if(o==e) System.out.println("Yes");
            else System.out.println("No");
        }
        else {
            if(Math.min(o,e)+1==Math.max(o,e)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}


