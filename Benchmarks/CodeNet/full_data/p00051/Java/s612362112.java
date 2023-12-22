import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			char[] c=sc.next().toCharArray();
			Arrays.sort(c);
			int min=Integer.parseInt(String.valueOf(c));
			char[] d=new char[c.length];
			for(int j=0;j<c.length;j++){
				d[j]=c[c.length-j-1];
			}
			int max=Integer.parseInt(String.valueOf(d));
			System.out.println(max-min);
		}
	}
}