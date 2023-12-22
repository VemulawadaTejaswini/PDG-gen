import java.util.*;
public class Main {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int r=sc.nextInt();
int d=sc.nextInt();
int a[]=new int [101];
for(int i=d;i<101;i+=d) {
	a[i]++;
}
int count=0;
for(int i=l;i<=r;i++) {
	if(a[i]>=1) {
		count++;
	}
}
System.out.println(count);
	}

}
