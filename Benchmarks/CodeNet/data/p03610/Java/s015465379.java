import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int l = s.length();
        String ans = "";

        for(int i=0; i<l; i++){
            if(i%2==0){
                ans += s.substring(i, i+1);
            }
        }
        System.out.println(ans);
    }
}