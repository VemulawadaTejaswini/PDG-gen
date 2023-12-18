import java.util.*;
public class main{
  public static void(String[] args){
    Scanner sc = new Scanner(System.in);
    	int r = sc.nextInt();
    	int g = sc.nextInt();
    	int b = sc.nextInt();
    		r = r*100;
			g = g*10;
    		if((r+g+b)%4 == 0){
              System.out.println("YES");
            }else{
              System.out.println("NO");
            }
  }
} 