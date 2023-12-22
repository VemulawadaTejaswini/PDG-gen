import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		double max=0;
		double min=990485039;
		while(cin.hasNext()){
			double d = cin.nextDouble();
			if(max<d){
				max=d;
			}
			if(min>d){
				min=d;
			}
		}
		System.out.println(max-min);

	}

}