import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String namechar[] = {"z","a","b","c","d","e","f","g",
				"h","i","j","k","l","m","n","o","p","q","r",
				"s","t","u","v","w","x","y"};
		List<String> name = new ArrayList<String>(); //reverse
		while(N!=0) {
			name.add(namechar[(int) (N%26)]);
			N = N/26;
		}		
		for(int i = name.size(); i > 0; i--) {
			System.out.print(name.get(i-1));
		}
		System.out.println();
		sc.close();
	}
}
