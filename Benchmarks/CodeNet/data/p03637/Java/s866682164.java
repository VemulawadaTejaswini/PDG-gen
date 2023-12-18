import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
long a[]=new long[n];
int ki=0;
int si=0;
for(int i=0;i<n;i++){
	a[i]=sc.nextLong();
	if(a[i]%2!=0){
		ki++;
	}
	if(a[i]%4==0){
		si++;
	}
}
if(ki<=si){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
	}
}