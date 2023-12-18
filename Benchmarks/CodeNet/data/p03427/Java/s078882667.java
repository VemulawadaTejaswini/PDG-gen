import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    long res=0;
    if(s.length()==1) {
    	System.out.println(s);
    }else if(s.substring(0, 1).equals("1")) {
    	System.out.println(9*(s.length()-1));
    }else {
    	res+=Long.valueOf(s.substring(0,1))-1;
    	for(int i=1;i<s.length();i++) {
    		res+=9;
    	}
    	System.out.println(res);
    }
  }
}