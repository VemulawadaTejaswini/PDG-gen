import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	private static BufferedReader br;
	
	public static void main(String[] args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);	
		int k = Integer.parseInt(line[1]);
		List<Long> nums = new ArrayList<Long>();
		for(String str :br.readLine().split(" ")){
			nums.add(Long.parseLong(str));
		}
		br.close();
		List<Long> result = kake(nums);
		Collections.sort(result);
		System.out.println(result.get(k-1));
		
	}
	
	private static List<Long> kake(List<Long> list){
		List<Long> kake = new ArrayList<Long>();
		for(int i=0;i<list.size();i++) {
			for(int n =0;n<list.size();n++) {
				if(n!=i && i>n) {
					kake.add(list.get(i)*list.get(n));
				}
			}
		}
		return kake;
	}
}
