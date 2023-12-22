import java.util.Scanner;
import java.Math.*;
 
public class Main
{
    public static void main(String[] args)
    {
	Scanner cin = new Scanner(System.in);
	int[] a,b,c;
 	while(cin.hasNext()){
		a = cin.nextInt();
		b = cin.nextInt();
		c = a + b;
		int cnt = 0;
		for(int i=1; i<=20; i++){
			if(c/Math.pow(10,i) < 1 && cnt == 0){System.out.println(i); cnt = 1;}
		}
	}
    }
}