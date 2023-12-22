import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int pa = s.nextInt();
		if((a-pa) < 0){
			if((a+b) < pa){
			System.out.println("NA");
			}else{
				System.out.println(pa-a);
			}
		}else if(a >= pa){
			System.out.println(0);
		}else{}
	}
}
