import java.math.BigInteger;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String tmp;
		boolean flag;
		
		for(int i=0;i<num;i++){
		flag = false;
			tmp = scan.next();
			if(tmp.length() > 80){
				flag = true;
			}
			BigInteger bix = new BigInteger(tmp);
			tmp = scan.next();
			if(tmp.length() > 80){
				flag = true;
			}
			BigInteger biy = new BigInteger(tmp);
			BigInteger add = bix.add(biy);
			
			if(add.toString().length() > 80 || flag){
				System.out.println("overflow");
			}else{
				System.out.println(add.toString());
			}
		}
	}
}