import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        String ans = "Yes";
        for(int i = 0; i < a + b + 1; i++){
            if(i == a) continue;
            else if(s.charAt(i) < '0' || s.charAt(i) > '9') ans = "No";
        }
        if(s.charAt(a) != '-') ans = "No";
        System.out.println(ans);
    }
}