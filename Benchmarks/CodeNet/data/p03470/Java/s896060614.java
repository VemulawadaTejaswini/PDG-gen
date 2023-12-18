import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int n=scanner.nextInt();



		List<Integer> data=new ArrayList<Integer>();

		for(int i=0;i<n;i++) {

			int buf=scanner.nextInt();

			if(!data.contains(buf)) {
				data.add(buf);
			}

		}

		int result=data.size();






		System.out.println(result);



		scanner.close();

	}

	public static int getsumofkakuketa(int n) {

		int result=0;

		while(true) {

			result+=n%10;

			if(n/10!=0) {
				n/=10;
			}else {
				return result;
			}
		}



	}

	public static boolean isMacthed(int a,int b,int sum) {

		if(sum>=a && sum<=b) {
			return true;
		}else {
			return false;
		}

	}



}





