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
	//	human[count] = Integer.parseInt(br.readLine());
		Arrays.sort(human);
		int result = 0;
		int bus = 0;
		int point=human[0]+wait;
		for(int i=0 ;i<co ; i++) {
			int c = human[i];
			if(bus < limit && point > c ) {
				bus++;
			}else {
              result++;
                if(i+1 >= co){
                   break;
                }
				point = human[i+1] + wait;
				
                bus=0;
			}
		}
		System.out.println(result);
	}
}