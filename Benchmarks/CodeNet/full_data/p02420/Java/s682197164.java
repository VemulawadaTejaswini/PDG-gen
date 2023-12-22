import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			String data = sc.next();
			char[] card = data.toCharArray();

			if(data.equals("-")) break;

			char[] temp = new char[data.length()];

			int n = sc.nextInt();
		
			for(int i = 0;i < n;i++){
				int num = sc.nextInt();

				for(int m = 0;m < num;m++){
					temp[data.length() - num + m] = card[m];
				}
				
				for(int m = num;m < data.length();m++){
					temp[m - num] = card[m];
				}

				for(int m = 0;m < data.length();m++){
					card[m] = temp[m];
				}			
			}
			System.out.println(card);
		}

	}
}
