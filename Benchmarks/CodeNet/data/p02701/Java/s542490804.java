
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int count=0;
		
		ArrayList<String> array=new ArrayList<>();
		ArrayList<String> result=new ArrayList<>();

		Scanner sc=new Scanner(System.in);
		int kuzi=sc.nextInt();
		
		for(int i=0;i<kuzi;i++) {
			array.add(sc.next());
		}
		

		
		for(String array1:array) {
				if(!result.contains(array1)) {
					result.add(array1);
					}
				}
				
			
			
	
		
		System.out.println(result.size());

	}
}