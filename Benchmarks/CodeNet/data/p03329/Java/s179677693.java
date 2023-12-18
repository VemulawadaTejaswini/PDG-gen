import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		num += n % 9;
		if(n%9>=6)num -= 5;
		n /= 9;
		while(n!=0){
			num += n % 9;
			if(n%9>=4)num -= 3;
			n /=  9;
		}
		System.out.println(num);
	}
}