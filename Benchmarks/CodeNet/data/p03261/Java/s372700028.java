import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<String>list =new ArrayList<>();
		
		String tar=scanner.next();
		list.add(tar);
		for(int i=0;i<n-1;i++){
			tar=scanner.next();
			if((!list.contains(tar))&&tar.substring(0,1).equals(list.get(i).substring(list.get(i).length()-1,list.get(i).length()))){
				
			}else{
				System.out.println("No");
				return;
			}
			list.add(tar);
		}
		
		System.out.println("Yes");
	}
}
