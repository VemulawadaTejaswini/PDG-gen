import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int x = 0;
		scan.close();
		for(int i=1;i<=n;i++){
			x=i;
			if(x%3==0){
				System.out.print(i+" ");
			}else{
				while(x>0){
					if(i%10==3){
						System.out.print(i+" ");
						break;
					}
					x/=10;
				}
			}
		}
		System.out.println("");
	}
}