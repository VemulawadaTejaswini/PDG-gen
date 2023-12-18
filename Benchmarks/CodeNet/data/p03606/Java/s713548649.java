import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n=Integer.parseInt(sc.next());       
int ans = 0;    
for (int i = 0; i < n; i++) {
        int l = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
    ans+=r-l+1;
    }
    out.println(ans);
}
}