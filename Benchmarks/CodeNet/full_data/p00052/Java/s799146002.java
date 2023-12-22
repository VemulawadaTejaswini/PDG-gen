import java.math.BigInteger;
import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		while(true){
			int num = scan.nextInt();
			BigInteger sum = BigInteger.valueOf(num);
			
			if(num == 0){
				break;
			}
			
			for(int i=num-1;i>1;i--){
				BigInteger bi = BigInteger.valueOf(i);
				sum = sum.multiply(bi);
			}
			int count = 0;
			for(int i=sum.toString().length()-1;i>0;i--){
				if(sum.toString().charAt(i) == '0'){
					count++;
				}else{
					break;
				}
			}
			
			System.out.println(count);
		}
	}
}