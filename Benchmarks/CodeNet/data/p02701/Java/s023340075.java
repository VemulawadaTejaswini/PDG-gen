
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		List<String> array=new ArrayList<>();
		List<String> result=new ArrayList<>();

		Scanner sc=new Scanner(System.in);
		int kuzi=sc.nextInt();
		
		for(int i=0;i<kuzi;i++) {
			array.add(sc.next());
			if(!result.contains(array.get(i))) {
				result.add(array.get(i));
			}
		}
	
		
		System.out.println(result.size());

	}
}