import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=sc.nextInt();
		sc.nextLine();
		String s[]=new String[k];
		for(int i=0;i<k;i++){
			s[i]=sc.nextLine();
		}
		System.out.println(solve(s));
	}

	private static double solve(String[] s) {
		// TODO Auto-generated method stub
		double result=0;
		for(String str:s){
			String tmp=str.split(" ")[0];
			if(str.indexOf("JPY")>=0){

				result+=Double.parseDouble(tmp);
			}else{
				result+=Double.parseDouble(tmp)*380000;
			}
		
		}
		return result;
	}

	private static int[] nextArr(int k) {
		// TODO Auto-generated method stub
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {

			res[i] = sc.nextInt();
		}
		return res;
	}

}
