import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      for(int i = 0;i < s.length();i++){
      	if(s.substring(i,i+1).equals("N"))a++;
        else if(s.substring(i,i+1).equals("W"))b++;
        else if(s.substring(i,i+1).equals("S"))c++;
        else d++;
      }
      if((a*c>0&&b*d>0)||(a*c>0&&b+d==0)||(a+c==0&&b*d>0))System.out.println("Yes");
      else System.out.println("No");
    }
}
