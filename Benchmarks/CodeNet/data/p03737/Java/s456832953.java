import java.util.*;
public class Main{
	public static void main(String[]args){
    	Scanner sc=new Scanner(System.in);
        String a=sc.next();
      String b=sc.next();
      String c=sc.next();
      char[]aa=a.toCharArray();
      char[]ab=b.toCharArray();char[]ac=c.toCharArray();
        System.out.println((char)(int)(aa[0]-32)+(char)(int)(ab[0]-32)+(char)(int)(ac[0]-32));
    }
}
