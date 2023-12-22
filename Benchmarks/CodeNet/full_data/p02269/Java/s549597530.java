import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
 
public class Main{
    public static void main(String[] aaa){
        Scanner s = new Scanner(System.in);
        Set<String> hset = new HashSet<String>();
        int n,q,i,count=0;
        String a,b;
        n = s.nextInt();
        for(i=0;i<n;i++){
            a = s.next();
            b = s.next();
            if(a.equals("insert"))hset.add(b);
            else{
                if(hset.contains(b))System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}
