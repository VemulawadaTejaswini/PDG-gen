import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			
			String str = sc.next();
			
			for(int i = 0; i < n; i++){
				StringBuilder sb = new StringBuilder();
				int before = -1;
				int count = 0;
				
				for(char c : str.toCharArray()){
					if(before == -1 || before == c - '0'){
						before = c - '0';
						count++;
					}else if(before != c - '0'){
						sb.append(count + "" + before);
						before = c - '0';
						count = 1;
					}	
				}
				
				if(before != -1 && count > 0){
					sb.append(count + "" + before);
				}
				
				str = sb.toString();	
			}
			
			System.out.println(str);
			
		}
		
	}
}