import java.math.*;
import java.text.*;
import java.lang.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0) break;
			boolean flag = true;
			for(int i=0; i<n; i++){
				int num=in.nextInt(), val=in.nextInt(), mnt=in.nextInt();
				if((long)val*mnt >= 1000000){
					System.out.println(num);
					flag = false;
				}
			}
			if(flag)
				System.out.println("NA");
		}
	}

}