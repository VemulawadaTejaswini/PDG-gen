import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String inputP = scanner.nextLine();
		String[] pStr = inputP.split(" ", 0);
		int n = pStr.length;
		
		int pInt[] = new int[n];
		for(int i=0;i<n;i++){
			pInt[i] = Integer.parseInt(pStr[i]);
		}
		
		int accept = pInt[0] - pInt[1];
		
		if(pInt[2] > accept) {
			System.out.println(pInt[2] - accept);
		} else {
			System.out.println(0);
		}
	}
}