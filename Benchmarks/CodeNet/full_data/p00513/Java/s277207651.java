import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			boolean fl = false;
			int count = 0;
			for(int i = 1;i <= n;i++){
				int s = scan.nextInt();
				fl = false;
				for(int j = 1;j <= s/2;j++){
					for(int k = 1;k <= s/2;k++){
						if(s == (j+k+2*j*k)){
							fl = true;
							break;
						}
					}
					if(fl){
						break;
					}
				}
				if(!fl){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}