import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d = sc.nextInt();
		int count=600/d;
		int sum=0;
		int x=0;
		for(int i=1;i<count;i++){
			sum=sum+(d*x*x);
			x+=d;
		}
		System.out.println(sum);
	}

}