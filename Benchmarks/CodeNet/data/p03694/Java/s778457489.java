import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int[] a=new int[n];
    for (int i = 0; i < n; i++) {
        a[i]=Integer.parseInt(sc.next());
    }
Arrays.sort(a);
    out.println(a[n-1]-a[0]);
}
}