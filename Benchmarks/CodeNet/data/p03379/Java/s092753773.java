import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int[] x=new int[n+1];
    for (int i = 1; i <= n; i++) {
        x[i]=Integer.parseInt(sc.next());
    }
  Arrays.sort(x);
  int ans=0;
    for (int i = 1; i <= n; i++) {
      if(i<=n/2){ans=n/2+1;}else{ans=n/2;}
    out.println(x[ans]);
    }
}
}
