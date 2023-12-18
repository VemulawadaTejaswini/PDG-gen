import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append((char)(A.charAt(0)+'A'-'a'));
        sb.append((char)(B.charAt(0)+'A'-'a'));
        sb.append((char)(C.charAt(0)+'A'-'a'));
        System.out.println(sb.toString());
    }
}
