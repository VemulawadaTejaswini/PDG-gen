import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double N=sc.nextDouble();
		int tmp=0;
		for(;N>0;){
			tmp+=N%10;
			N/=10;
		}
		if(tmp%9==0){
			System.out.println("Yes");
        }else{
			System.out.println("No");
		}
	}
}