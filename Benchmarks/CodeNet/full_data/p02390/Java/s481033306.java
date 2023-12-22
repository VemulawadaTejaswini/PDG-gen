import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int s=scan.nextInt();
int m=0;
int h=0;
if(s>60){
	m=s/60;
	s=s-60*m;
}
if(m>60){
	h=m/60;
	m=m-60*h;
}
System.out.println(h+":"+m+":"+s);
}

}