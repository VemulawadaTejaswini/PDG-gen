import java.util.Scanner;
import java.util.ArrayList;
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

		while(min <= max){

			int middle = (min + max) / 2;

			if(serch.equals(data.get(middle))){
				return true;
			}else if(serch.compareTo(data.get(middle)) < 0){
				max = middle - 1;
			}else{
				min = middle + 1;
			}
		}
		return false;
	}
}