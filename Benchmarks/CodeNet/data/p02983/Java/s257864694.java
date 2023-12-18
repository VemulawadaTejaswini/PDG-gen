import java.util.*;
public class Main {
	public static void main(String args[] ){
		Scanner sc =new Scanner(System.in);
	int n = sc.nextInt();
	int m =sc.nextInt();
	int min =Integer.MAX_VALUE;
	for(int i=n;i<=m;i++) {
		for(int j=i+1;j<=m;j++) {
			int data =(i*j)%2019;
			if(min>data) {
				min =data;
			}
			
		}
	}
	System.out.println(min);
	
	}
}
