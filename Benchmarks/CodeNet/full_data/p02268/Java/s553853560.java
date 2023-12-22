import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			String[] s = new String[n];
			for(int i = 0;i < n;i++){
				s[i] = scan.next();
			}
			int q = scan.nextInt();
			String[] t = new String[q];
			for(int i = 0;i < q;i++){
				t[i] = scan.next();
			}
			Arrays.sort(t);
			int count = 0;
			int start = 0;
			for(int i = 0;i < q;i++){
				for(int j = start;j < n;j++){
					if(t[i].equals(s[j])){
						count++;
						start = j;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}