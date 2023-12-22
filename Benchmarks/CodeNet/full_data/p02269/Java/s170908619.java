import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static final int A = 1;
	static final int C = 13;
	static final int G = 157;		
	static final int T = 1885;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		//?????????
		int n = Integer.parseInt(bf.readLine());
		String[] hash = new String[26365];
		
		for(int i=0;i<n;i++){
			String[] str =bf.readLine().split(" ");
			String command =str[0];
			String ch = str[1];
			
			if(command.equals("insert")){
				int count =0;
				for(int j=0;j<ch.length();j++){
					switch(ch.charAt(j)){
					case 'A':
						count+=A;
						break;
					case 'C':
						count+=C;
						break;
					case 'T':
						count+=T;
						break;
					case 'G':
						count+=G;
						break;
					}
				}
				hash[count]=ch;
			}else{
				int count =0;
				for(int j=0;j<ch.length();j++){
					switch(ch.charAt(j)){
					case 'A':
						count+=A;
						break;
					case 'C':
						count+=C;
						break;
					case 'T':
						count+=T;
						break;
					case 'G':
						count+=G;
						break;
					}
				}
				if(hash[count]!=null && hash[count].equals(ch)){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}

	}

}