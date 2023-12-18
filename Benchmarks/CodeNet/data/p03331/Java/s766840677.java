import java.util.*;
public class Main {
	public static void main(String[] args){
	
	//入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//String S=sc.next();
		int a=0;		//適当に調整
		
		while(N>0){
			a+=N%10;
			N/=10;
		}
		if(a==1){
			a=10;
		}
	
	//出力
		System.out.println(a);
	}
}