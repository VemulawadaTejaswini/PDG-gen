import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int p = sc.nextInt();
			int so = 0;
			for(int i=1; i<=p; i++){
				int yaku = 0;
				for(int j=1; j<=i; j++){
					if(i%j == 0){
						yaku+=1;
					}
				}
				if(yaku == 2){
					so+=1;
				}
			}
			System.out.println(so);
		}
	}
}