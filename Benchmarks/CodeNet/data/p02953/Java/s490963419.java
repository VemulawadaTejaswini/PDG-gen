
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> numberList = new ArrayList();
		for(int i = 0; i < n; i++) {
			numberList.add(sc.nextInt());
		}
		
		String message = "Yes";
		int minimumNumber = numberList.get(0);
		for(int i = 0; i < n-1; i++) {
			int beforeNumber = numberList.get(i);
			int afterNumber = numberList.get(i + 1);
			if(numberList.size() == 1) {
				break;
			}
			
			if(beforeNumber - 1 > afterNumber) {
				message = "No";
				break;
			}
			
			
			if(beforeNumber > afterNumber && minimumNumber < beforeNumber - 1) {
				minimumNumber = beforeNumber - 1;
			}else if(beforeNumber == afterNumber && minimumNumber < beforeNumber) {
				minimumNumber = beforeNumber;
			}
			
			if(minimumNumber > afterNumber) {
				message = "No";
			}			

			
			
		}
		System.out.println(message);
		
		


		

		
		

		
		
	}	

}

