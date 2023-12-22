import java.util.*;
public class Main {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[10001];

	
	for(int j=1;j<=Math.sqrt(n);j++) {
		for(int k=1;k<=Math.sqrt(n);k++) {
			for(int l=1;l<=Math.sqrt(n);l++) {
				int i=j*j+k*k+l*l+j*k+k*l+l*j ;
              if(i<=10000)
				a[i]++;
				
				
			}
		}
	
	}
      int sum=0;
	for(int i=1;i<=n;i++){
 System.out.println(a[i]);
}
     
	}

}
