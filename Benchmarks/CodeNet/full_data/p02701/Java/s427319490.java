import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();		//くじn回引く

		ArrayList<String>array=new ArrayList<String>();

		for(int i=0;i<n;i++) {		//くじの回数分回す
			array.add(sc.next());
		}
		
		HashSet<String>keihin=new HashSet<String>(array);
		
		System.out.println(keihin.size());
		sc.close();
	}

}