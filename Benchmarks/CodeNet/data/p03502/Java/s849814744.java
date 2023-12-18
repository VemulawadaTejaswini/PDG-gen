import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int N = Integer.valueOf(str);

        int sum = 0;
        for(int i=0;i<str.length();i++){
            sum += str.charAt(i) - '0';
        }

        System.out.println(N%sum==0?"Yes":"No");
    }
}