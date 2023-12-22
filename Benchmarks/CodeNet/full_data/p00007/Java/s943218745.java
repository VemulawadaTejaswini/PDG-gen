import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int debt=100000;
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			debt=(int)Math.ceil((debt*1.05)/1000)*1000;
		}
		System.out.println(debt);
		sc.close();
	}
}