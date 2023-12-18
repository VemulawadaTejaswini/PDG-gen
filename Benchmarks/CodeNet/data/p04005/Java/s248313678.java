import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		new Main().run();
	}


	void run(){
		Scanner sc = new Scanner(System.in);

		boolean f = false;
		long[] a = new long[3];
		for(int i=0;i<3;i++){
			a[i] = sc.nextLong();
			if(a[i]%2==0){
				f = true;
			}
		}
		if(f){
			System.out.println(0);
		}else{
			Arrays.sort(a);
			System.out.println(a[0]*a[1]);
		}
	}

}
