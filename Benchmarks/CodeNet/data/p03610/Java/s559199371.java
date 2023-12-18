import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        String s = sc.next();

	        int length = s.length();
	        String[] a = new String[length];

	        for(int b=0; b<length; b++){
	        	a[b] = s.substring(b,b+1);

	        	if((b+1)%2 != 0){
	        		System.out.print(a[b]);
	        	}

	        }


	}

}
