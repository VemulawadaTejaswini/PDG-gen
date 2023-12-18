import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        int n=s.length();
        int k=sc.nextInt();
        HashSet<String> set=new HashSet<>();
        for (int i = 1; i <=n; i++) {
            int p=n+1-i;
            for (int j =1; j <= p; j++) {
                set.add(s.substring(j-1, i+j-1));
            }
        }
        String[] sub=new String[set.size()];
        HashSet<String> t=new HashSet<>();
        int c=0;
        for (int i = 1; i <= n; i++) {
            int p=n+1-i;
            for (int j = 1; j <= p; j++) {
                int q1=t.size();
                t.add(s.substring(j-1, i+j-1));
                int q2=t.size();
                if(q1!=q2){
                    sub[c]=s.substring(j-1, i+j-1);
                    c++;
                }
            }
        }
        Arrays.sort(sub);
        out.println(sub[k-1]);
    }
}