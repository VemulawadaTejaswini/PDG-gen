import java.io.*;
import java.util.ArrayList;

public class Main {
	
	static int person = 5;

	public static void main(String args[]) throws IOException {
		boolean flg = true;
		
		while (flg) {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<String> fivehands = new ArrayList<String>();

			for (int i = 0; i < person; i++) {
				
				fivehands.add(bf.readLine());
				if(fivehands.get(0).equals("0")){
					person = -1;
				}
			}
			
			if(person == -1){
				flg = false;
			}else{
				judge(fivehands);
			}
		}
	}

	private static void judge(ArrayList<String> fivehands){
		int sum = 1000;
		
		for (String a : fivehands) {
			if (a.equals("1")) {
				sum = sum + 100;
			} else if (a.equals("2")) {
				sum = sum + 10;
			} else if (a.equals("3")) {
				sum = sum + 1;
			}
		}
		
		String judgeSum = String.valueOf(sum);
		
		if(judgeSum.contains("0") && !judgeSum.contains(String.valueOf(person))){
			if(judgeSum.charAt(1) == '0'){
				judgeDetail(fivehands, "2", "3");
			}else if(judgeSum.charAt(2) == '0'){
				judgeDetail(fivehands, "3", "1");
			}else if(judgeSum.charAt(3) == '0'){
				judgeDetail(fivehands, "1", "2");
			}
		}else{
			for (int i = 0; i < person; i++) {
				System.out.println("3");
			}
		}
	}
	
	private static void judgeDetail(ArrayList<String> fivehands, String win, String lose) {

		for(String a :fivehands){
			if(a.equals(win)){
				System.out.println("1");
			}else if(a.equals(lose)){
				System.out.println("2");
			}else{
				System.out.println("-1");
			}
		}
	}	
}