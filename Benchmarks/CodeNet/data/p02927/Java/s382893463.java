import java.util.*;

public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m=sc.nextInt();
		int d=sc.nextInt();

		int count=0;


		for(int i=10;i<=d;i++){
			int d10=i/10;
			int d1=i%10;
			if(d1>=2 && d10>=2 && d1*d10<=m){
				count++;
			}
		}


		System.out.println(count);


	}
}
