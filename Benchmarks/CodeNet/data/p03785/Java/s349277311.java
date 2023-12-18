import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String [] oneList = br.readLine().split(" ");
		int co = Integer.parseInt(oneList[0]);
		int limit = Integer.parseInt(oneList[1]);
		int wait = Integer.parseInt(oneList[2]);
		int [] human = new int[co];
		int count = 0;
		while(br.ready()) {
			human[count] = Integer.parseInt(br.readLine());
			count++;
		}
		//human[count] = Integer.parseInt(br.readLine());
		Arrays.sort(human);
		int result = 0;
		int bus = 0;
		for(int i=0 ;i<co ; i++) {
			int c = human[i];
			if(c != -1) {
				int point = c + wait;
				human[i] = -1;
				bus++;
				for(int n=0;n<co;n++){
					int cc = human[n];
					if(cc!=-1) {
						if(cc <= point && bus < limit) {
							bus++;
							human[n] = -1;
						}
					}
					if(bus >= limit) {
						break;
					}
				}
				result++;
				bus = 0;
			}
		}
		System.out.println(result);
	}
}