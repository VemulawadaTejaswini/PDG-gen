import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			long n = scan.nextLong();
			if(n == 0){
				break;
			}
			String Yon = "4";
			String Roku = "6";
			for(int i = 1; i <= n;i++){
				String Mozi = String.valueOf(i);
				for(int j = 0; j < Mozi.length();j++){
					String Hikaku = String.valueOf(Mozi.charAt(j));
					if(Hikaku.equals(Yon) || Hikaku.equals(Roku)){
						++n;
						break;
					}
				}
			}
			System.out.println(n);
		}
	}
}