import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String nums = br.readLine();
		String numsArray[] = nums.split(" ");
		long sum = 0;
		int max=-1000000, min=1000000, tmp=0;
		for(int i=0; i<num; i++){
			tmp = Integer.parseInt(numsArray[i]);
			if(tmp>max){
				max = tmp;
			}else if(tmp<min){
				min = tmp;
			}
			sum += tmp;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}