import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		long n,cun,i = 0;
		while(scan.hasNext()){
			n = scan.nextInt();
			i = 0;
			cun = 0;
			if(n >= 3){
				cun = 2;
			}
			for(int j = 5 ; j <= n ; j++){
				if(j % 2 == 0 && j % 3 == 0){
					;
				}else{
					for(i = 2 ; i < j ; i ++){
						if(j % i == 0){
							break;
						}
					}
					if(j == i){
						++cun;
					}
				}
			}
			System.out.println(cun);
		}
	}
}