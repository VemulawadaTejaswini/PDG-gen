import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mstr = br.readLine();
		String str = mstr;
		
		
		
		for(int i = 0 ; i < 26 ; i++){
			int c = 'a'+i;
			int rindex = 0;
			int sindex = 0;
			int count = 0;
			int index;
			double rrate = 0.0;
			while((index = str.indexOf(c,rindex+1)) != -1){
				count++;
				double rate = (double)count/(index-sindex+1);
				if(count > 1){
				if(rrate < rate){
					sindex = rindex;
					count = 2;
					rate = (double)count/(index-sindex+1);
				}
				if(index - sindex+1 >= 2)
				if(Math.floor((double)(index - sindex+1)/2.0) < count ){
					System.out.println((sindex+1) + " " + (index+1));
					return;
				}
				}
				rindex = index;
				rrate = rate;
			}
		}
		
		System.out.println(-1+" "+-1);
	}
}
