import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			for(int i = 0;i < n;i++){
				int m = scan.nextInt();
				int e = scan.nextInt();
				int j = scan.nextInt();
				if(m == 100 || e == 100 || j == 100){
					System.out.println("A");
				}else{
					if(m + e >= 180){
						System.out.println("A");
					}else{
						int ave = (m + e + j) / 3;
						if(ave >= 80){
							System.out.println("A");
						}else if(ave >= 70){
							System.out.println("B");
						}else if(ave >= 50 && (m >= 80 || e >= 80)){
							System.out.println("B");
						}else{
							System.out.println("C");
						}
					}
				}
			}
		}
	}
}