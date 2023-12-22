import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		while(scan.hasNext()){
			int w = scan.nextInt();
			int i = 1;
			
			while(i <= 512){
				
				if((w & i) == i){
					sb.append(i).append(' ');
				}
				
				i = i << 1;
			}
			
			String s = sb.toString().trim();
			System.out.printf("%s\n", s);
		}
	}
}