import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num = sc.nextInt();
			for(int i = num-1 ; i >= 0 ; i--){
				if(i % 2 == 0)continue;
				boolean ok = true;
				for(int j = 3 ; j <= Math.sqrt(i) ; j++){
					if(i % j == 0){
						ok = false;
						break;
					}
				}
				if(ok){
					System.out.print(i+" ");
					break;
				}
			}
			for(int i = num+1 ; ; i++){
				if(i % 2 == 0)continue;
				boolean ok = true;
				for(int j = 3 ; j <= Math.sqrt(i) ; j++){
					if(i % j == 0){
						ok = false;
						break;
					}
				}
				if(ok){
					System.out.print(i);
					break;
				}
			}
		}
		sc.close();
	}
}