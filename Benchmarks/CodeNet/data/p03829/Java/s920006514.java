import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
long arr[]=new long[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextLong();
}
long res=0;
for(int i=0;i<n-1;i++) {
	if(((arr[i+1]-arr[i])*a)>b){
		res+=b;
	}else {
		res+=(arr[i+1]-arr[i])*a;
	}
}
System.out.println(res);

}

}