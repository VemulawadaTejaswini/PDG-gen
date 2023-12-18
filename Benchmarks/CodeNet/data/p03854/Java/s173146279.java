import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String a = "dream";
        String b = "dreamer";
        String c = "erase";
        String d = "eraser";
        while(true){
            int t=S.indexOf(d);
            if(t==-1){break;}
            S=S.substring(0,t)+S.substring(t+6,S.length());
        }
        while(true){
            int t=S.indexOf(c);
            if(t==-1){break;}
            S=S.substring(0,t)+S.substring(t+5,S.length());
        }
        while(true){
            int t=S.indexOf(b);
            if(t==-1){break;}
            S=S.substring(0,t)+S.substring(t+7,S.length());
        }
        while(true){
            int t=S.indexOf(a);
            if(t==-1){break;}
            S=S.substring(0,t)+S.substring(t+5,S.length());
        }
        if("".equals(S)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
