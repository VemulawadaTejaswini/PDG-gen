import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> S = new ArrayList<String>();

		boolean result;

		for(int i = 0; i < n; i++){
			String str1 = scan.next();
			String str2 = scan.next();

			if(str1.equals("insert")){
				S.add(str2);
			}else{
				Collections.sort(S);
				result = linearSearch(S, str2);
				if(result){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}
	}

	static boolean linearSearch(ArrayList<String> data, String serch){
		
		int first = data.indexOf(serch);
		
		if(first >= 0){
				return true;
		}
		return false;
	}
}