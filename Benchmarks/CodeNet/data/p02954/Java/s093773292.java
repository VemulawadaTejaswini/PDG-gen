
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		ArrayList<Integer> RAry = new ArrayList<>();
		ArrayList<Integer> LAry = new ArrayList<>();
		int n = sb.length();
		while(sb.length() != 0){
			int r = sb.indexOf("L");
			RAry.add(r);
			sb.delete(0, r);
			int l = sb.indexOf("R");
			if(l == -1){
				l = sb.length();
			}
			LAry.add(l);
			sb.delete(0, l);
		}
		int[] ans = new int[n];
		int index = 0;
		for(int i = 0; i < RAry.size(); i++){
			int r = RAry.get(i);
			int l = LAry.get(i);
			int sum = r + l;
			if(sum % 2 == 0){
				ans[index + r - 1] += sum /2;
				ans[index + r] += sum /2;
			}
			else{
				if(r % 2 == 0){
					ans[index + r - 1] += sum / 2;
					ans[index + r] += sum / 2 + 1;
					
				}
				else{
					ans[index + r - 1] += sum / 2 + 1;
					ans[index + r] += sum / 2;
				}
			}
			index += sum;
		}
		for(int num : ans){
			System.out.println(num);
		}
	}
}
