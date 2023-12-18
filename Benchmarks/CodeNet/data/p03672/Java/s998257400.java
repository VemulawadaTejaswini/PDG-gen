import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] charArray = str.toCharArray();
		ArrayList<Character> array = new ArrayList<Character>();
		for(int i=0; i< charArray.length; i++){
			array.add(charArray[i]);
		}

		//List<char[]> array = Arrays.asList(charArray);
		int len = array.size();
		while(len > 0){
			array.remove(len-1);
			array.remove(len-2);
			len -= 2;
			if(IsEvenString(array)){
				System.out.println(len);
				break;
			}
			
		}
		
	}

	public static boolean IsEvenString(ArrayList<Character> x){
		for(int i =0; i < x.size() / 2; i++){
			if (x.get(i) !=x.get(i + x.size() / 2)){
				return false;
			}
		}
		return true;
		
	}
}