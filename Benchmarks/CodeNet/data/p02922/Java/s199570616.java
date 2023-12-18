import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int ans=0;
        int ch=1;
        while(ch<b){
            ch=ch+a-1;
            ans++;
        }
        System.out.print(ans);
    }
}
