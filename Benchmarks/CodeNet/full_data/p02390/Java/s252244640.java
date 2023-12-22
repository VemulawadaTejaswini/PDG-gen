import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.next());
		int m=0;
		int h=0;
		if(s>60){
			m=s/60;
			s=s%60;
		}else
			System.out.println(s);
		if(m>60){
			h=m/60;
			m=m%60;
		}else if(s!=0)
			System.out.println(m+":"+s);
		if(h!=0)
			System.out.println(h+":"+m+":"+s);
		scan.close();
	}
}