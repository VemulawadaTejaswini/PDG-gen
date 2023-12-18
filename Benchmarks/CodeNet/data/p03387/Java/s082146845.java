import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n[] = {a,b,c};
		Arrays.sort(n);
		int num1 = (n[2]-n[0])/2;
		int num2 = (n[2]-n[1])/2;
		if(n[0]%2==n[1]%2 && n[1]%2==n[2]%2)System.out.println(num1+num2);
		else if(n[0]%2==n[1]%2 && n[1]%2!=n[2]%2)System.out.println(num1+num2+1);
        else System.out.println(num1+num2+2);
	}
}