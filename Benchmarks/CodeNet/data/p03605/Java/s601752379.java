import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = a/10;
	int c = b*10;
	int d = a-c;
	if(b%9==0||d%9==0) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	}
	}