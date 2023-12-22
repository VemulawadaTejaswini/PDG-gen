import java.util.*;
import static java.lang.Math.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		while(sc.hasNextDouble()){
			double a=sc.nextDouble();
			double temp=a;
			for(int i =0;i<4;i++){
				a*=2;
				temp+=a;
				a/=3;
				temp+=a;
			}
			a*=2;
			temp+=a;
			pr.println("" +temp);
		}
		pr.flush();
	}

}