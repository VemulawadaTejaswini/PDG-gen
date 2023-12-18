import java.util.Scanner;
public class Main {
	public static int str(String a,String b) {
		if(a.equals(b)) {
			return 0;
		}
		return 1;
	}
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	String str=scan.next();
    	int a=0;
    	a+=str(String.valueOf(str.charAt(0)),"C");
    	a+=str(String.valueOf(str.charAt(1)),"O");
    	a+=str(String.valueOf(str.charAt(2)),"D");
    	a+=str(String.valueOf(str.charAt(3)),"E");
    	a+=str(String.valueOf(str.charAt(4)),"F");
    	a+=str(String.valueOf(str.charAt(5)),"E");
    	a+=str(String.valueOf(str.charAt(6)),"S");
    	a+=str(String.valueOf(str.charAt(7)),"T");
    	a+=str(String.valueOf(str.charAt(8)),"I");
    	a+=str(String.valueOf(str.charAt(9)),"V");
    	a+=str(String.valueOf(str.charAt(10)),"A");
    	a+=str(String.valueOf(str.charAt(11)),"L");
    	a+=str(String.valueOf(str.charAt(12)),"2");
    	a+=str(String.valueOf(str.charAt(13)),"0");
    	a+=str(String.valueOf(str.charAt(14)),"1");
    	a+=str(String.valueOf(str.charAt(15)),"6");
System.out.println(a);
    }
}