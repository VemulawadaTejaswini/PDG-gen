import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] s = new int[100];
		int i = 0;
		
		while(scan.hasNextInt()){
			n = scan.nextInt();
			if(n != 0){
				s[i] = n;
				i++;
			}else{
				i--;
				System.out.println(s[i]);
			}
		}
	}
}