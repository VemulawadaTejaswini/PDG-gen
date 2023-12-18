import java.util.*;

public class Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        String code = sc.next();
        StringBuffer sb = new StringBuffer();
        char[] m = code.toCharArray();
        for (int i = 0; i < m.length; i++){
            sb.append(m[i]);
            if (i == 3){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}