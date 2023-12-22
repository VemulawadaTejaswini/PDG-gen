import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABProblem{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String input_str = br.readLine();
			while(input_str != null){
				String[] input_strs = input_str.split(" ");
				if(input_strs.length >= 2){
					int a = Integer.parseInt(input_strs[0]);
					int b = Integer.parseInt(input_strs[1]);
					System.out.println(a + b);
				}
				input_str = br.readLine();
			}
		}catch(Exception e){
			//System.err.println(e);
		}
	}
}