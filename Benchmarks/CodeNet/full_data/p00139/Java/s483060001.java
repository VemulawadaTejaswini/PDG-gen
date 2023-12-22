import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		StringBuilder source;
		int n = Integer.valueOf(reader.readLine());
		
		for(int i = 0; i < n; i++){
			source = new StringBuilder(reader.readLine());
			if(source.substring(0, 2).equals(">'")){
				char ch[] = source.substring(2, source.length() - 1).toCharArray();
				int flag = 0, count = 0;
				for(char var : ch){
					if(flag == 0 && var == '=') count++;
					else if(flag == 1 && var == '=') count--;
					else if(flag == 0 && var == '#') flag = 1;
					else{
						flag = 2;
						break;
					}
				}
				if(count != 0 || flag == 2) System.out.println("NA");
				else System.out.println("A");
			}else if(source.substring(0, 2).equals(">^")){
				char ch[] = source.substring(2, source.length() - 2).toCharArray();
				int flag = 1, currect = 0;
				for(char var : ch){
					if(flag != currect && var == 'Q'){
						currect = 1;
					}else if(flag != currect && var == '='){
						currect = 0;
					}else{
						System.out.println("NA");
						flag = 2;
						break;
					}
					flag = flag == 1 ? 0 : 1;
				}
				if(flag != 2) System.out.println("B");
			}else System.out.println("NA");
		}
		reader.close();
	}
}