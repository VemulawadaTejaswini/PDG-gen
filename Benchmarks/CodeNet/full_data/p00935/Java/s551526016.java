import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		while(true){
			String input = br.readLine();
			
			if(input == null){
				break;
			}
			
			sb.append(input);
		}
		
		String seq = sb.toString();
		seq = seq.replaceAll(" ", "");
		
//		System.out.println(seq);
		
		//??¢?´¢????§?
		for(int i = 0; i < Integer.MAX_VALUE; i++){
			String intStr = Integer.toString(i);
			
			if(!seq.contains(intStr)){
				System.out.println(i);
				return;
			}
		}
	}

}