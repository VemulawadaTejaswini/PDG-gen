import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int count = 0;
			for(int i = 0;i < n;i++){
				int t = scan.nextInt();
				if(t == 2){
					count++;
					continue;
				}
				boolean fl = true;
				for(int j = 2;j < t;j++){
					if(t % j == 0){
						fl = false;
						break;
					}
				}
				if(fl){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}