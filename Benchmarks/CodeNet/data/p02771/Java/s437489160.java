import java.util.ArrayList;
import java.util.*;
class Main{
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      List<Integer> l=new ArrayList();
      l.add(a);
      l.add(b);
      l.add(c);
      Collections.sort(l);
      if((l.get(0)==l.get(1) && l.get(1)!=l.get(2)) || (l.get(0)!=l.get(1) && l.get(1)==l.get(2))){
         System.out.println("Yes");
         System.exit(0);
      }else{
         System.out.println("No");
         System.exit(0);
      }
   }
}  