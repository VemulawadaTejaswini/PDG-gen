import java.util.*;
public class IMain {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=n;i++) {
	int count=0;
	for(int j=1;j<Math.sqrt(i);j++) {
		for(int k=1;k<Math.sqrt(i);k++) {
			for(int l=1;l<Math.sqrt(i);l++) {
				if((j*j+k*k+l*l+j*k+k*l+l*j)==i) {
			count++;
				}
				
			}
		}
	
	}
	System.out.println(count);
}
	}

}
