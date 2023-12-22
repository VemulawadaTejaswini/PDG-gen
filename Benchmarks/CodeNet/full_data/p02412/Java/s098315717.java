import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true){
			int n = scan.nextInt();
			int x = scan.nextInt();

			if(n==0&&x==0){
				break;
			}

			for(int i = 1; i<=n; i++){
				for(int j=1; i<=n; j++){
					if(i==j){
						break;
					}
					for(int k=1; k<=n; k++){
						if(i==k||j==k){
							break;
						}

						if(i+j+k==x){
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}