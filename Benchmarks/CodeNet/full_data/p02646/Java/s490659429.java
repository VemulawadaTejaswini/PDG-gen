import java.util.*;
public class Main{
	
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long v = sc.nextLong();
      long b = sc.nextLong();
      long w = sc.nextLong();
      long t = sc.nextLong();
      
      long agoal = (t*(v))+a;
      long bgoal = (t*(w))+b;
      System.out.println(agoal);
      System.out.println(bgoal);
          
      if(agoal>=bgoal){
      	System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
}