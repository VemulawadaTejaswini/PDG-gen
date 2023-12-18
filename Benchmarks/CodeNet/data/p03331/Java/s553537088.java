import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int b;
		int minsum=Integer.MAX_VALUE;
		for(int a=1;a<=n/2;a++){
			b=n-a;
			int tempa=a;
			//System.out.println("ere");
			int suma=0;
			int sumb=0;
			while(tempa>0){
				suma+=tempa%10;
				tempa/=10;
			}
			while(b>0){
				sumb+=b%10;
				b/=10;
			}
			if(suma+sumb<minsum){
				//System.out.println(a+" "+sumb);
				minsum=suma+sumb;
			}
		}
		System.out.println(minsum);
	}
}