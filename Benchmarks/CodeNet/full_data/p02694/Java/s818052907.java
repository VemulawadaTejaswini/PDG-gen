import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt(); //基準値
		double i = 100;
        double r = 0.01;
        int cnt = 1;
		while(i<X){
          
			i = i + (i*r);
			i++;
            cnt++;
		}
		
		
		System.out.println(cnt);
	}
}
