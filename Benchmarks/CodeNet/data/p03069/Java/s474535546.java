import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n =sc.nextInt();
		String s=sc.next();

		char c[]=new char[n];
		int blackcount=0;
		int whitecount=0;
		boolean first=false;

		for(int i=0;i<n;++i){
			if(s.charAt(i)=='.'&&first==true)++whitecount;
			else if (s.charAt(i)=='#'){
				first=true;
				++blackcount;
			}

		}
		System.out.println(Math.min(whitecount, blackcount));


	}
}