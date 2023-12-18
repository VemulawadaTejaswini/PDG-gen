import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int count = 0;
   List<Integer> list1 = new ArrayList<Integer>();
   list1.add(1);
   list1.add(6);
   list1.add(9);
   list1.add(36);
   list1.add(81);
   list1.add(216);
   list1.add(729);
   list1.add(1296);
   list1.add(6561);
   list1.add(7776);
   list1.add(46656);
   list1.add(59049);
   while(true){
     for(int i = 0; i < list1.size(); i++){
       if(list1.get(i) <= n && n < list1.get(i+1)){
         n = n - list1.get(i);
         count = count + 1;
         break;
       }
    }
    if(n == 0){
      break;
    }
  }
  System.out.println(count);
  }
}
