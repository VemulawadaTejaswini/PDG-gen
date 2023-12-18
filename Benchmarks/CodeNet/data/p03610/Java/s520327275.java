import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int l = s.length();
        String ans = "";
        for(int i=0; i<l; i+=2){
            ans += "" + s.charAt(i);
        }
        System.out.println(ans);
    }
}