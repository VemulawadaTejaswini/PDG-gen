import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			if(n==0) break;
			int check = 0;
			int count = 0;
			for(int i=1;i<n;i++){
				check = i;
				for(int j=i+1;j<n;j++){
					check+=j;
					if(n==check){
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}