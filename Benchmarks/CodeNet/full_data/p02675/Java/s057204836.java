import java.util.*;
class Main {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int lastD=n%10;
	if(lastD==2||lastD==4||lastD==5||lastD==7||lastD==9)
		System.out.println("hon");
	else if(lastD==0||lastD==0||lastD==6||lastD==8)
		System.out.println("pon");
	else
		System.out.println("bon");
}
}
