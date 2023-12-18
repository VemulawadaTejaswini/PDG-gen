import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner x = new Scanner(System.in);
      String sa = x.next();
      String sb = x.next();
      String sc = x.next();
      int ca = 0;
      int cb = 0;
      int cc = 0;
      int turn = 0;
      while(true){
      	if(turn==0){
          if(sa.substring(ca,ca+1).equals("a"))turn=0;
          else if(sa.substring(ca,ca+1).equals("b"))turn=1;
          else turn = 2;
          ca++;
        }
        else if(turn==1){
          if(sb.substring(cb,cb+1).equals("a"))turn=0;
          else if(sb.substring(cb,cb+1).equals("b"))turn=1;
          else turn = 2;
          cb++;
        }
        else if(turn==2){
          if(sc.substring(cc,cc+1).equals("a"))turn=0;
          else if(sc.substring(cc,cc+1).equals("b"))turn=1;
          else turn = 2;
          cc++;
        }
        if(ca==sa.length()&&turn==0){
        	System.out.println("A");
          return;
        }
        if(cb==sb.length()&&turn==1){
        	System.out.println("B");
          return;
        }
        if(cc==sc.length()&&turn==2){
        	System.out.println("C");
          return;
        }
      }
    }
}