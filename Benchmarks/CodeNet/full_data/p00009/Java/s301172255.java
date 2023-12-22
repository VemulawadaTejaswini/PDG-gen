import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int kazu = 0;
			
			for(int i = 2;i<=n;i++){
				int count = 0;
				for(int j=2;j<i;j++){
					if(i%j==0){
						count++;
					}
				}
				
				if(count==0){
					kazu++;
				}
				
			}
			
			System.out.println(kazu);
		}
	}
}