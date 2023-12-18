import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        boolean normal = true;
        int q = Integer.parseInt(sc.next());
        for(int i=0; i<q; i++) {
            int t = Integer.parseInt(sc.next());
            if(t == 1) {
                if(normal) normal = false;
                else normal = true;
            }else {
                int f = Integer.parseInt(sc.next());
                String c = sc.next();
                if(f == 1) {
                    if(normal) sb.insert(0, c);
                    else sb.append(c);
                }
                else {
                    if(normal) sb.append(c);
                    else sb.insert(0, c);
                }
            }
        }
        if(normal) System.out.println(sb);
        else System.out.println(sb.reverse());
    }
}