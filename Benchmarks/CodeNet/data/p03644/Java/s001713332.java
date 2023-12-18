import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int n = Integer.parseInt(sc.next());
    int ans=0;
    int temp=0;
    for (int i = 1; i <= n; i++) {
        if(temp<=Integer.numberOfTrailingZeros(i)){
        ans=i;
        temp=Integer.numberOfTrailingZeros(i);
        }
    }
    out.println(ans);
}
}