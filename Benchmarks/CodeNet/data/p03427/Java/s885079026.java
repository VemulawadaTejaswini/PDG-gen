import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    long res=0,buff=(long)Math.pow(10, s.length())-1;
    if(buff==Long.valueOf(s)) {
    	System.out.println(s.length()*9);
    }if(s.length()==1) {
    	System.out.println(s);
    }else if(s.substring(0, 1).equals("1")) {
    	System.out.println(9*(s.length()-1));
    }else {
    	res=Long.valueOf(s.substring(0,1))-1;
    	System.out.println(res+9*(s.length()-1));
    }
    System.out.println(buff);
  }
}