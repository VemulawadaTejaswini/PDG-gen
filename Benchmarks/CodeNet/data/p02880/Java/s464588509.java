//shara's here
import java.util.*;

public class My_Sweet_Java_Start {
	public static void main(String[] args){
		Scanner t=new Scanner(System.in);
		int x;
		x=t.nextInt();
		boolean ok=false;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				if(i*j==x) {ok=true;}
			}
		}
		if(ok==true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		t.close();
	}

}

