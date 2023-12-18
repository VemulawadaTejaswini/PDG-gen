import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
         
     try (Scanner scan = new Scanner(System.in)) {
			int inputN = scan.nextInt();
			int inputQ = scan.nextInt();
			String inputStr = scan.next();

			List<Integer> ans = new ArrayList<>();
			
			for (int i = 0; i < inputQ; i++) {
				int inputI = scan.nextInt()-1;
				int inputR = scan.nextInt();
				ans.add((inputStr.substring(inputI,inputR)+"D").split("AC").length-1);
             			}
			
			for (int i = 0; i < inputQ; i++) {
				System.out.println(ans.get(i));
			
			}
		}
    }
}