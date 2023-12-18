import java.util.Scanner;
class Main{
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	String a=scan.next();
	//int c=scan.nextInt();
	int ans=0;
	if(a.charAt(6)<'5') {
		ans=1;
	}
	else{
	}
	if(a.charAt(5)=='1') {
		ans=0;
	}
	System.out.println(ans==1?"Heisei":"TBD");
	}
}
