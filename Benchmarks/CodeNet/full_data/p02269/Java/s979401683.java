import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> S = new ArrayList<String>();

		boolean result;
		String str1;
		String str2;

		for(int i = 0; i < n; i++){
			str1 = scan.next();
			 str2 = scan.next();

			if(str1.equals("insert")){
				S.add(str2);
			}else{
				Collections.sort(S);
				result = BinarySearch(S, str2);
				if(result){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}
	}

	static boolean BinarySearch(ArrayList<String> data, String serch){

		int min = 0;
		int max = data.size() - 1;
		int middle;
		int num;

		while(min <= max){

			middle = (min + max) / 2;
			
			num = serch.compareTo(data.get(middle));

			if(num == 0){
				return true;
			}else if(num < 0){
				max = middle - 1;
			}else{
				min = middle + 1;
			}
		}
		return false;
	}
}