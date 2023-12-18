import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String n = sc.next();
      int cnt = 0;
      for(int i = 0;i < n.length();i++)if(n.substring(i,i+1).equals("9"))cnt++;
      String m = n.substring(0,1);
      if(n.length()==1)System.out.println(n);
      else if(cnt!=n.length())System.out.println(Integer.parseInt(m)-1+(n.length()-1)*9);
      else System.out.println(n);
    }
}