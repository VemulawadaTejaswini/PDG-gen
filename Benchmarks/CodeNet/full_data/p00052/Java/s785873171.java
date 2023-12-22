import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			BigInteger fact=new BigInteger("1");
			for(;n>=1;n--){
				fact=fact.multiply(new BigInteger(String.valueOf(n)));
			}
			char[] check=String.valueOf(fact).toCharArray();
			int count=0;
			for(int i=check.length-1;i>=0;i--){
				if(check[i]=='0'){
					count++;
				}else{
					break;
				}
			}
			System.out.println(count);
		}
	}
}