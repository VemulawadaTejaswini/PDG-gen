import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	String s = "";
	while (n>26)  {
		if (n%26==1) {s+='z';}
		else if (n%26==0) s+='z';
		else s+=(char) ((n%26)+96);
		n/=26;
	}
	if (n!=1) s+=(char) (n+96);
	for (int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
	sc.close();}}