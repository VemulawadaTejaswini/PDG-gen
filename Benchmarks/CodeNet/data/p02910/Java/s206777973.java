import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        String s = sc.next();
        for (int i=0;i<s.length();i++){
            if ((i%2==0&&s.charAt(i)=='L')||(i%2==1&&s.charAt(i)=='R'))b=false;
        }
        if (b)System.out.println("Yes");
        else System.out.println("No");
    }
}
