import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s[]=in.nextLine().split("");
        long no=0,sum = 0;
        for (String var:s){
            sum += Long.parseLong(var);
            no = no*10+Long.parseLong(var);
        }
        if (no%sum==0) System.out.println("Yes");
        else System.out.println("No");
    }
}