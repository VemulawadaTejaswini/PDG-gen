
import java.math.BigInteger;
import java.util.*;
public class Main {





public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=sc.next();
if(a.length()>b.length()) {
  System.out.println("GREATER");
}else if(a.length()<b.length()) {
  System.out.println("LESS");
}else
if(a.compareTo(b)==0) {
  System.out.println("EQUAL");
}else if(a.compareTo(b)>0) {
  System.out.println("GREATER");
}else {
  System.out.println("LESS");
}

}

}

class pair{
	int x,y;
	pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}
