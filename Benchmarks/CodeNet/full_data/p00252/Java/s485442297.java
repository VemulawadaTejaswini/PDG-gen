import java.util.Scanner;

public class maina{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[]=sc.nextLine().split (" ");
		String b=a[0]+a[1]+a[2];
		int ans=Integer.parseInt(b,2);
		if(ans==6||ans==1)System.out.println("Open");
		else System.out.println("Close");
	}
}