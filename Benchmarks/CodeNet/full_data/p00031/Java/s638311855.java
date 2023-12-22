import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int obj = sc.nextInt();
			if(obj > 1023) break;
			int sum = 0;
			boolean bj = false;
			for(int i = 1; i <= 512; i *= 2){
				if(obj == i){
					System.out.println(i);
					bj = true;
					break;
				}
			}
			for(int i = 1; i <= 512; i *= 2){
				if(bj) break;
				if(i < obj & (i*2) + sum != obj){
					sum += i;
					System.out.print(i + " ");
				}
				if(obj == sum){
					break;
				}

			}
			System.out.println();
		}
	}
}