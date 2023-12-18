import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		
		int[] v1 = new int[100000];
		int[] v2 = new int[100000];
		
		for(int i = 0 ; i < v1.length ; i++){
			v1[i] = 0;
			v2[i] = 0;
		}
		
		for(int i = 0 ; i < n ; i++){
			if(i%2 == 0){
				v1[Integer.parseInt(strs[i])]++;
			}else{
				v2[Integer.parseInt(strs[i])]++;
			}
		}
		int max11 = 0;
		int max12 = 0;
		int max11id = 0;
		int max12id = 0;
		int max21 = 0;
		int max22 = 0;
		int max21id = 0;
		int max22id = 0;
		
		for(int i = 0 ; i < v1.length ; i++){
			if(v1[i] > max11){
				max12 = max11;
				max12id = max11id;
				max11 = v1[i];
				max11id = i;
			}else if(v1[i] > max12){
				max12 = v1[i];
				max12id = i;
			}
		}
		for(int i = 0 ; i < v2.length ; i++){
			if(v2[i] > max21){
				max22 = max21;
				max22id = max21id;
				max21 = v2[i];
				max21id = i;
			}else if(v2[i] > max22){
				max22 = v2[i];
				max22id = i;
			}
		}
		
		if(max11id != max21id){
			System.out.println((n - max11 - max21));
		}else{
			if((n - max11 - max22) < (n - max12 - max21)){
				System.out.println((n - max11 - max22));
			}else{
				System.out.println((n - max12 - max21));
			}
		}
	}
}
