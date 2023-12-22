import java.util.Scanner;
public class Main{
    public static boolean judge(String s, String p){
        String ss = s.concat(s);
        if(ss.contains(p))
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        if(judge(s,p))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
