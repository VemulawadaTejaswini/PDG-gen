import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int[] x=new int[n+1];
int[] y=new int[n+1];
    for (int i = 1; i <= n; i++) {
        x[i]=Integer.parseInt(sc.next());
        y[i]=x[i];
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            y[j]=x[j];
        }
        y[i]=0;
        Arrays.sort(y);
        out.println(y[n/2+1]);
        
    }
}
}