import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tblData[] = new int[3];
		int k = 2;
		int tmp;
		
		//?????????????´?
		for(int i = 0; i < 3; i++) {
			tblData[i] = sc.nextInt();
		}
		
		//??´???(??????)
		while(k > 0) {
			int i = 0;
			while(i < k) {
				if(tblData[i] > tblData[i+1]) {
					tmp = tblData[i];
					tblData[i] = tblData[i+1];
					tblData[i+1] = tmp;
				}
				i++;
			}
			k--;
		}
		
		System.out.println(tblData[0] + " " + tblData[1] + " " + tblData[2]);
	}
}