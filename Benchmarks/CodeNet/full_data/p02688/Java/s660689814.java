
import java.util.Map.Entry;
import java.util.*;
 
import org.w3c.dom.css.Counter;
 
public class Main {
//public class App {
 
    public static void main(final String[] args){
     //スキャン
     final Scanner s = new Scanner(System.in);
     final int N = Integer.parseInt(s.next());
     final int K = Integer.parseInt(s.next());
     HashSet<String> hashSet = new HashSet<String>();

     for(int i=0; i< K;i++){
        int di = Integer.parseInt(s.next());
        String blank = s.nextLine();
        String huge = s.nextLine();

        String[] hage = huge.split(" ",0);
        int hageN= hage.length;
        for (int num =0;num<hageN;num++){
            if(!hashSet.contains(hage[num])){
                hashSet.add(hage[num]);
            }
        }

     }
     s.close();

     System.out.println(N-hashSet.size());
}
}