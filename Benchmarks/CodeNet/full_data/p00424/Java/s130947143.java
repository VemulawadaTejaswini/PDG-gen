import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		StringBuilder[] ans = new StringBuilder[1000];
		int index = 0;

		while( n != 0 ){
			String[][] data = new String[n][2];
			for(int i = 0; i < n; i++){
				data[i][0] = stdIn.next();
				data[i][1] = stdIn.next();
			}
		
			int x = stdIn.nextInt();
			for(int i = 0; i < x; i++){
				String s = stdIn.next();
				for(int j = 0; j < n; j++){
					if( s.equals(data[j][0]) ){
						s = new String(data[j][1]);
						break;
					}
				}
				if( i == 0 ){
					ans[index] = new StringBuilder(s);
				} else {
					ans[index].append(s);
				}
			
			}
			index++;
			n = stdIn.nextInt();
		}
		for(int i = 0; i < index; i++){
			System.out.println(ans[i].toString());
		}
	}
}