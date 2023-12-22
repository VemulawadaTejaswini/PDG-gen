

import java.util.Map.Entry;
import java.util.*;
 
//import org.w3c.dom.css.Counter;
 
public class Main {
//public class App {
 
    public static void main(final String[] args){
     //スキャン
     final Scanner s = new Scanner(System.in);
      int A = Integer.parseInt(s.next());
      int B = Integer.parseInt(s.next());
      int C = Integer.parseInt(s.next());
     final int X = Integer.parseInt(s.next());
     int count =0;
    
     while (A>=B) {
        B = B *2;
        //System.out.println(B);
        count++;
     }
    
     while (B>=C) {
        C = C *2;
        //System.out.println(B);
        count++;
     }
     if(count<=X){
        System.out.println("Yes");
     }else{
        System.out.println("No");
     }
     
 

    
/*
     for(int i=0; i< K;i++){
        int di = Integer.pa rseInt(s.next());
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
*/
}
}