import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] c = s.toCharArray();

        int t = 0;

        for (int i=0; i<s.length(); i++){
            if (i%2==0){
                if (c[i]=='R' || c[i]=='U' || c[i]=='D'){
                    t++;
                }
            }else {
                if (c[i]=='L' || c[i]=='U' || c[i]=='D'){
                    t++;
                }
            }
        }
        if (t==s.length()){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}