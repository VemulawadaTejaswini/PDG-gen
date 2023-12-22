import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    Stack<String> st[] = new Stack[n];
    for(int i=0;i<n;i++) st[i] = new Stack<String>();
    String must;
    while(!(must = scan.next()).equals("quit")){
      int a = scan.nextInt();
       if(must.equals("push")){
         String x = scan.next();
         st[a-1].push(x);
       }else if(must.equals("pop")){
         out.println(st[a-1].pop());
       }else{
         int b = scan.nextInt();
         st[b-1].push(st[a-1].pop());
       }
    }
  }
}