import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final char[][] button = {
				{},
				{'.',',','!','?',' '},
				{'a','b','c'},
				{'d','e','f'},
				{'g','h','i'},
				{'j','k','l'},
				{'m','n','o'},
				{'p','q','r','s'},
				{'t','u','v'},
				{'w','x','y','z'}
				};
		int n = stdIn.nextInt();
		stdIn.nextLine();
		for(int j=0;j<n;j++){
			String[] key = stdIn.nextLine().split("0");
			
			for(int i=0;i<key.length;i++){
				if(key[i].length()<1){
					continue;
				}
				int num = Integer.parseInt(key[i])%10;			
				int times = key[i].length();
				int pos = times%(button[num].length)-1;
				if(pos<0){
					pos = button[num].length-1;
				}
				System.out.print(button[num][pos]);
			}
			System.out.println();
		}
	}
}