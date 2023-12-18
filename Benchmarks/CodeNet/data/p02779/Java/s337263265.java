import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean b = true;
		Set<Integer> set = new HashSet<Integer>();//HashSetで空の箱を作る
		for(int  i=0; i<N; i++) {
			int a= sc.nextInt();
			b =	set.add(Integer.valueOf(a));//set.addで空の箱に重複を除いたaを追加する
			if(!b){
				System.out.println("NO");
              	return;
			}
		}
		//元の配列の要素数と異なればNO、変化していなければYES
		System.out.println("YES");
	}
		
}