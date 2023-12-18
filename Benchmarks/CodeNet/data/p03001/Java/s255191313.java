import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	long w=sc.nextLong();
	long h=sc.nextLong();
	long x=sc.nextLong();
	long y=sc.nextLong();
	int ans=0;
	if(x==w/2&&y==h/2){
		ans=1;
	}
	System.out.println((float)(w*h)/2+" "+ans);

	}}