import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int k = Integer.parseInt(sc.next());
int[] l=new int[n];
    for (int i = 0; i < n; i++) {
        l[i]=Integer.parseInt(sc.next());
    }
Arrays.sort(l);
int ans=0;
for (int i = n-1; i >=n-k; i--) {
        ans+=l[i];
}
    out.println(ans);
}
}