import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
HashMap<Integer,Integer> x=new HashMap<>();
int n=sc.nextInt();
for (int i = 1; i <= n; i++) {
    int p=sc.nextInt();
    x.put(p,x.getOrDefault(p,0)+1);
}
int ans=0;
for (Integer i:x.keySet()) {
    if(x.get(i)>i){
        ans+=x.get(i)-i;
    }else if(x.get(i)<i){
        ans+=x.get(i);
    }
}
out.println(ans);
}
}