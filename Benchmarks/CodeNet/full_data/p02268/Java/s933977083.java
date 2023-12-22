import java.util.Scanner;
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
			int count = 0;
			long t = 0;
			for(int i = 0;i < q;i++){
				t = scan.nextLong();
				for(int j = 0;j < n;j++){
					if(s[j].equals(t+"")){
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}