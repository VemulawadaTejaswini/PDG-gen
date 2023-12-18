import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	long n=sc.nextLong();
	if(2*n%11==0){
System.out.println(2*n/11);
}else{
	System.out.println(2*n/11+1);
}}}