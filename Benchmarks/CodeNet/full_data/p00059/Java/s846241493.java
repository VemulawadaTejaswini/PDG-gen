import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double[] a=new double[8];
			for(int i=0;i<8;i++)a[i]=sc.nextDouble();
			if(a[2]<a[4] || a[6]<a[0] || a[3]<a[5] || a[7]<a[1])System.out.println("NO");
			else System.out.println("YES");
			
		}
	}
}