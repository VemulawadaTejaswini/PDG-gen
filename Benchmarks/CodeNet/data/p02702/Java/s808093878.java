import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		long cnt = 0;
		
		for(int i = 0; i < s.length()-3;i++) {
			for(int j = i+4; j < s.length()+1;j++) {
				String ss = s.substring(i,j);
				long num = Long.parseLong(ss);
				if(num % 2019 ==0){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
