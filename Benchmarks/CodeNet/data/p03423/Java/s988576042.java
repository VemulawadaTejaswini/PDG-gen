import java.util.*;
public class Main{
	int n;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//N人の生徒
		//3<=話し合う人
		Main m = new Main();//インスタンス化
		m.n = sc.nextInt();
		System.out.println(m.maxGroup(m.n));
	}

	int maxGroup(int n){
		int groupnumber = n / 3;
		//int groupremainder = n % 3;
		if(n % 3 == 0){

		return groupnumber;

		}else if(n % 3 < 3){

		return groupnumber;
		
		}
		return 0;
	}
}
