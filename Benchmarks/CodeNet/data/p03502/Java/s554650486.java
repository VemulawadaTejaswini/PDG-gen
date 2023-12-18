import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int ans = 0;
        for (int i=0;i<s.length();i++){
            ans+=s.charAt(i)-'0';
        }
        if (n%ans==0)System.out.println("Yes");
        else System.out.println("No");
    }
}
