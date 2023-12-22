import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[2];
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++){
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a[0]+b[0]-50);
	}
}