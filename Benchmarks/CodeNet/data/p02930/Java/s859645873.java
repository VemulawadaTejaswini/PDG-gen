import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<n; i++){
			for(int j=i+1; j<=n; j++){
				if((j-i)%2==0){
					int k=j-i;
					int count=0;
					while(k>1){
						k/=2;
						count++;
					}
					System.out.println(1+count);
				}else{
					System.out.println(1);
				}
			}
		}
	}
}
