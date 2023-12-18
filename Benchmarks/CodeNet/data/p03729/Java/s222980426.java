import java.util.*;
class ShiritoriA{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	String a=stdIn.next();
	String b=stdIn.next();
	String c=stdIn.next();
	if(a.charAt(a.length()-1)==b.charAt(0)&&b.charAt(b.length()-1)==c.charAt(0)){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
