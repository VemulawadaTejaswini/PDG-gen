import java.util.*;
class Main{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] argv){
		String s = scan.next();
		char[] c = s.toCharArray();
		int num = Character.getNumericValue(c[0]);
		if(num==9){System.out.println("999");return;}
		if((Character.getNumericValue(c[1])>num) || (Character.getNumericValue(c[2])>num)){
			num += 1;
			System.out.printf("%d%d%d",num,num,num);
			return;
		}
		System.out.printf("%d%d%d",num,num,num);
		return;
	}
}