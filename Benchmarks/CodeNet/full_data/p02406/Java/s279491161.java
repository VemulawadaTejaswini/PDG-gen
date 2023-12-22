import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		int i = 1;
		StringBuilder sb1 = new StringBuilder();
		for(i = 1 ; i <= n ; i++){
			if( i%3 == 0 ){
				sb1.append(i+" ");
				continue;
			}
			if(i%10 == 3){
				sb1.append(i+" ");
				continue;
			}
		}
		System.out.print(sb1);
	}

}