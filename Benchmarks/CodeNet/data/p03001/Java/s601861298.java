import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	float W=sc.nextInt();
	float H=sc.nextInt();
	float x=sc.nextInt();
	float y=sc.nextInt();
	sc.close();

	if(W/2==x&&H/2==y) {
		System.out.println(W*H/2+" "+1);
	}else {
		System.out.println(W*H/2+" "+0);
	}

}

}