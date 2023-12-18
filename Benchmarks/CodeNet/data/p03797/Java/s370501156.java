import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		long n = sc.nextLong();//s型
		long m = sc.nextLong();//c型
		long count=0;
		if(n>=m) {//sが多いのでcが２個ずつある分しか作れない
			count=m/2;
		}else{
			if(n*2>m) {//c*2個分しか作れないため
				count=m/2;
			}else if(m>n*2) {
				count=n;//sは作れる分
				count=count+((m-2*n)/4);//sがなくてもcで作れる分を足す
			}
		}
		System.out.println(count);
	}
}
