import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String tmpArray[] = br.readLine().split(" ");
			
			int n = Integer.parseInt(tmpArray[0]);
			int q = Integer.parseInt(tmpArray[1]);
			
			if(n == 0 && q == 0){
				break;
			}
						
			Era[] eraArray = new Era[n];
			for(int i = 0; i < n; i++){
				tmpArray = br.readLine().split(" ");
				
				String name = tmpArray[0];
				int ebYear = Integer.parseInt(tmpArray[1]);
				int wesYear = Integer.parseInt(tmpArray[2]);

				eraArray[i] = new Era(wesYear - ebYear + 1, wesYear, name);
			}
			
			Arrays.sort(eraArray);
			
			for(int i = 0; i < q; i++){
				int query = Integer.parseInt(br.readLine());
				
				int eraIndex = -1;
				for(int j = 0; j < n; j++){
					if(eraArray[j].start <= query && eraArray[j].end >= query){
						eraIndex = j;
						break;
					}
				}
				
				if(eraIndex >= 0){
					System.out.println(eraArray[eraIndex].name+" "+(query - eraArray[eraIndex].start + 1));
				}
				else {
					System.out.println("Unknown");
				}
			}
		}
	}

}

class Era implements Comparable<Era>{
	int start;
	int end;

	String name;
	
	Era(int start, int end, String name){
		this.start = start;
		this.end = end;
		this.name = name;
	}

	@Override
	public int compareTo(Era e1) {
		return this.start - e1.start;
	}
}
