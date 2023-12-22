import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int s;
	        int w;
                while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
                        sum = 0;
			for(int i = 0;i < n;i++){
				s = scan.nextInt() + scan.nextInt() + scan.nextInt();
				w = scan.nextInt();
				if(s <= 60 && w <= 2){
					sum += 600;
				}else if(s <= 80 && w <= 5){
					sum += 800;
				}else if(s <= 100 && w <= 10){
					sum += 1000;
				}else if(s <= 120 && w <= 15){
					sum += 1200;
				}else if(s <= 140 && w <= 20){
					sum += 1400;
				}else if(s <= 160 && w <= 25){
					sum += 1600;
				}
			}
			System.out.println(sum);
		}
	}
}