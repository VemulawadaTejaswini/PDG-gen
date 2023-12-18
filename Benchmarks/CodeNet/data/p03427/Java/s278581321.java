import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    long res=0;
    boolean flag=true;
    for(int i=0;i<s.length();i++) {
    	if(!s.substring(i, i+1).equals("9"))flag=false;
    }
    if(flag) {
    	System.out.println(9*s.length());
    	System.exit(0);
    }
    if(s.length()==1) {
    	System.out.println(s);
    }else if(s.substring(0, 1).equals("1")) {
    	System.out.println(9*(s.length()-1));
    }else {
    	res=Long.valueOf(s.substring(0,1))-1;
    	System.out.println(res+9*(s.length()-1));
    }
  }
}