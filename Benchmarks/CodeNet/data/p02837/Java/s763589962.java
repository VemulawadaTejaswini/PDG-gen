import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int a=0,b=0,c=0,wAw=0;
		for(int i=0;i<n;i++) {
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=scanner.nextInt();
			wAw+=c;
		}
		if(wAw%2==0) {
			
		}
		else if(wAw==0)
		{
			wAw=1;
		}
		else {
			wAw=0;
		}
		System.out.print(wAw);
	}

}
