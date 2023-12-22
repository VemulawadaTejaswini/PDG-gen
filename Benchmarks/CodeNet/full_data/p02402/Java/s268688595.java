import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		int n,min=0,max=0;
		long sum=0;
		String[] list;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		list = br.readLine().split(" ");

		min = Integer.parseInt(list[0]);
		max = Integer.parseInt(list[0]);

		for(int i = 0; i < n; i++){
			int num = Integer.parseInt(list[i]);
			sum += num;
			if(min > num)min = num;
			if(max < num)max = num;
		}
		System.out.println(min + " " + max + " " + sum);

        br.close();
	}
}