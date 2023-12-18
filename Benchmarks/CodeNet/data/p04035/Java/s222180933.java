import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String input[] = br.readLine().split(" ");
		int count = Integer.parseInt(input[0]);
		int maxLength =  Integer.parseInt(input[1]);
		String input2[] =br.readLine().split(" ");
		int total = 0;
		for(String s : input2) {
			int num =Integer.parseInt(s);
			total += num;
		}
		if(total < maxLength) {
			System.out.println("Impossible");
			return;
		}
		int left = 0;
		int right = count-1;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(;;) {
			int lnum = Integer.parseInt(input2[left]);
			int rnum = Integer.parseInt(input2[right]);
			if(lnum < rnum) {
				total -=lnum;
				result.add(++left);
			}else {
				total -=rnum;
				result.add(right--);
			}
			if(left == right) {
				break;
			}
			if(total < maxLength) {
				System.out.println("Impossible");
				return;
			}
		}
		System.out.println("Possible");
		for(int re:result) {
			System.out.println(re);
		}
	}
}