import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n,cun = 0;
		while(scan.hasNext()){
			n = scan.nextInt();
			int i = 0;
			cun = 0;
			for(int j = 2 ; j <= n ; j++){
				for(i = 2 ; i < j ; i ++){
					if(j % i == 0){
						break;
					}
				}
				if(j == i){
					++cun;
				}
			}
			System.out.println(cun);
		}
	}
}