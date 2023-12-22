import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	int num[31]={},cn=0;
	for(int i=1; i<29; i++){
		int n = stdIn.nextInt();
		num[n]++;
		}
	for(int i=1; i<31; i++){
		if(num[i]==0){
			System.out.println(i);
			cn++;
			}
		for(cn==2)break;	
		}	
	}
}