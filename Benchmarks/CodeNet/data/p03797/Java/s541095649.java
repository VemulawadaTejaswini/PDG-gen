import java.util.*;
public class Main {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = Integer.parseInt(sc.next());
        long c = Integer.parseInt(sc.next());
        long ans=0;

        if(s*2<=c){
            ans+=s;
            c-=2*s;
            ans+=c/4;

        }else{
            ans+=c/2;
        }

        System.out.println(ans);
    }
}