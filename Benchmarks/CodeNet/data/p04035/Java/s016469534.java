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
		ArrayList<String> list = new ArrayList();
		int order = 1;
		for(String s : input2) {
			int num =Integer.parseInt(s);
			list.add(s+":"+order);
			total += num;
			order++;
		}
		if(total < maxLength) {
			System.out.println("Impossible");
			return;
		}
		ArrayList<Integer> result = new ArrayList();
		int co =  count;
		while(list.size() > 1) {
			String first[] = list.get(0).split(":");
			int len1 =Integer.parseInt(first[0]);
			int num1 =Integer.parseInt(first[1]);
			String second[] = list.get(co-1).split(":");
			int len2 =Integer.parseInt(second[0]);
			int num2 =Integer.parseInt(second[1]);
			if(len1 < len2) {
				list.remove(0);
				result.add(num1);
			}else {
				list.remove(co-1);
				result.add(num2-1);
			}
			if(countList(list) < maxLength && result.size() != count-1) {
				System.out.println("Impossible");
				return;
			}
			co--;
		}
		System.out.println("Possible");
		for(int re:result) {
				System.out.println(re);
		}
	}
	private static int countList(ArrayList<String> list) {
		int total = 0;
		for(String s : list) {
			String ss[] = s.split(":");
			total += Integer.parseInt(ss[0]);
		}
		return total;
	}

}