import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = Long.parseLong(sc.next());
        String[] sp = S.split("");
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1; i<S.length(); i++) {
            if(sp[i-1].equals(sp[i])) {
                count++;
            }else {
                sb.append(sp[i-1]);
                sb.append(count);
                count = 1;
            }
        }
        sb.append(sp[S.length()-1]);
        sb.append(count);

        S = String.valueOf(sb);
        sp = S.split("");
        long keta = 0;
        int ans = 0;
        for(int i=0; i<sp.length; i++) {
            int n = Integer.parseInt(sp[i+1]);
            if(sp[i].equals("1")) {
                keta += n;
            }else {
                keta += Long.parseLong(sp[i])*n*5*1000*1000*1000*1000*1000;
                if(K <= keta) {
                    ans = Integer.parseInt(sp[i]);
                    break;
                }
            }
            i++;
        }
        System.out.println(ans);
    }
}