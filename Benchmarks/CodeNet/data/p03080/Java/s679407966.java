import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String strB = s.replaceAll("R", "");
        String strR = s.replaceAll("B", "");
        

        if (strR.length() > strB.length() )
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }

}