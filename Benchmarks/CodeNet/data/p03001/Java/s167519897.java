import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	double W=sc.nextInt();
	double H=sc.nextInt();
	double x=sc.nextInt();
	double y=sc.nextInt();
	sc.close();

	if(W/2==x&&H/2==y) {
		System.out.println(W*H/2+" "+1);
	}else {
		System.out.println(W*H/2+" "+0);
	}

}

}
