import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int count=0;
		
		ArrayList<String> array=new ArrayList<>();
		ArrayList<String> hikaku=new ArrayList<>();
		ArrayList<String> result=new ArrayList<>();

		Scanner sc=new Scanner(System.in);
		int kuzi=sc.nextInt();
		
		for(int i=0;i<kuzi;i++) {
			array.add(sc.next());
			hikaku=array;
		}
		

		
		for(String array1:array) {
			for(String hikaku1:hikaku) {
				if(array1.contains(hikaku1)) {
					if(!result.contains(hikaku1)) {
					result.add(array1);
					break;
					}
				}
				
			}
			
		}
		
		System.out.println(result.size());
	}

}