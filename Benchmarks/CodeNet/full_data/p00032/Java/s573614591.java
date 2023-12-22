import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",");
		int tyoucount = 0;
		int hisicount = 0;
		while(sc.hasNext()){
			int hen1 = sc.nextInt();
			int hen2 = sc.nextInt();
			int taikakusen = sc.nextInt();
			if(taikakusen*taikakusen == hen1*hen1 + hen2*hen2){
				tyoucount++;
			}else{
				hisicount++;
			}
		}
		System.out.printf("%d\n%d",tyoucount,hisicount);
		sc.close();
	}
}