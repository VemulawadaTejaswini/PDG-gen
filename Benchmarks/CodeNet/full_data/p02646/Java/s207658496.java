import java.util.*;

public class Main{
	
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long v = sc.nextLong();
      long b = sc.nextLong();
      long w = sc.nextLong();
      long t = sc.nextLong();
      
      if(((a>=-1000000000)&&(a<=1000000000)) &&((b>=-1000000000)&&(b<=1000000000))){
        if(((v>=1)&&(v<=1000000000))&&((w>=1)&&(w<=1000000000))&&((t>=1)&&(t<=1000000000))&&(a!=b)){
          long agoal = (t*v)+a;
          long bgoal = (t*w)+b;
          System.out.println(agoal);
          System.out.println(bgoal);
          
          if(agoal>=bgoal){
        	System.out.println("YES");
          }else{
            System.out.println("NO");
          }
        }
      }
    }
}