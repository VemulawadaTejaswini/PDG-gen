import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[] st = new int[6];
			for(int i = 0;i < n;i++){
				double t = scan.nextDouble();
				if(t >= 185){
					st[5]++;
				}else if(t >= 180){
					st[4]++;
				}else if(t >= 175){
					st[3]++;
				}else if(t >= 170){
					st[2]++;
				}else if(t >= 165){
					st[1]++;
				}else{
					st[0]++;
				}
			}
			for(int i = 0;i < 6;i++){
				System.out.print(i+1 + ":");
				for(int j = 0;j < st[i];j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}