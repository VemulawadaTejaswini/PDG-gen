import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String nostr = scan.nextLine();
		String str = scan.nextLine();
		
		String[] strs = str.split(" ");
		List<String> strs2 = Arrays.asList(strs);
		ArrayList<String> str3 = new ArrayList<String>(strs2);
		
		List<String> flg = new ArrayList<String>();
		str3.forEach(v ->{
			int iv = Integer.parseInt(v);
			if(iv%2==0) {
				if(iv%3==0 || iv%5==0) {
					flg.add("ok");
				}else {
					flg.add("ng");
				}
			}
		});
		
		if(flg.size()==0) {
			System.out.println("APPROVED");
		}else if(flg.contains("ng")) {
			System.out.println("DENIED");
		}else {
			System.out.println("APPROVED");
		}

	}

}