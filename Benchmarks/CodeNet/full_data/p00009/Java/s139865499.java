import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String num=br.readLine();
			if(num==null){
				break;
			}
			int max = Integer.parseInt(num);
			Vector<Integer> nums=new Vector<Integer>();
			for(int n=max;n>=2;n--){
				nums.add(n);
			}
			for(int n=2;n<max;n++){
				for(int m=n*2;m<=max;m+=n){
					int index=nums.indexOf(m);
					if(index!=-1){
						nums.remove(index);
					}
				}
			}
			System.out.println(nums.size());
		}
	}
}