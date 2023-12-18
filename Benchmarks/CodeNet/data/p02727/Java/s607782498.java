import java.util.*;
import java.math.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int x = sc.nextInt();
   int y = sc.nextInt();
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   Queue queue = new PriorityQueue();
   Integer arraya[] = new Integer[a];
   Integer arrayb[] = new Integer[b];
   for (int i=0;i<a;i++){
    arraya[i] = sc.nextInt(); 
   }
   for (int i=0;i<b;i++){
    arrayb[i] = sc.nextInt(); 
   }
   Arrays.sort(arraya, Collections.reverseOrder());
   Arrays.sort(arrayb, Collections.reverseOrder());
  
   for (int i=0;i<c;i++){
    queue.add(-1*sc.nextInt()); 
   }
   for (int i=0;i<x+y;i++){
    queue.add(0); 
   }
   long ret = 0;
   long retc = -1*(int)queue.peek();
   for (int i=0;i<x;i++){
    long temp = arraya[i];
    if (retc>temp){
      ret += retc;
      retc = -1*(int)queue.peek();
    }else{
      ret += temp;
    }
   }
   for (int i=0;i<y;i++){
    long temp = arrayb[i];
    if (retc>temp){
      ret += retc;
      retc = -1*(int)queue.peek();
    }else{
      ret += temp;
    }
   }

     System.out.println(ret);

   
}
}
