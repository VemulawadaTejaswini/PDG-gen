//import java.io.File;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
try{
		//Scanner scan = new Scanner(new File("in.txt"));
		Scanner scan = new Scanner(System.in);


		int[] alpha = new int['z'-'a'+1];

		while(scan.hasNext()) {
			char[] arr = scan.nextLine().toCharArray();
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] >= 'a' && arr[i] <= 'z') {
					alpha[arr[i]-'a']++;
				}
				if(arr[i] >= 'A' && arr[i] <= 'Z') {
					alpha[arr[i]-'A']++;
				}
			}
		}

		for(int i = 0; i < alpha.length; i++) {
			char letter = 'a';
			letter += i;
			System.out.println(letter+" : "+alpha[i]);
		}
		

}catch(Exception e) {
	e.printStackTrace();
}
	}
}