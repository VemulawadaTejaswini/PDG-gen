import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int pt = 1;
		int pa = 1;
		
		
		for(int i = 0 ; i < n ; i++ ){
			String[] strs = br.readLine().split(" ");
			int nt = Integer.parseInt(strs[0]);
			int na = Integer.parseInt(strs[1]);
			int addt = 0;
			int adda = 0;
			
			while(true){
				if(nt * (pa+adda) == na * (pt+addt)){
					break;
				}
				if(nt * (pa+adda) > na * (pt+addt)){
					addt++;
				}
				if(nt * (pa+adda) < na * (pt+addt)){
					adda++;
				}
				
			}
			pt = pt+addt;
			pa = pa+adda;
		}
		
		System.out.println(pt+pa);
	}
}
