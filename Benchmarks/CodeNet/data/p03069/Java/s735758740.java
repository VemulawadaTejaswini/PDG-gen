import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n =sc.nextInt();
		String s=sc.next();

		char c[]=new char[n];
		int blackcount=0;
		int whitecount=0;
		int rightcount=0;
		boolean first=false;
		boolean right=true;
		for(int i=0;i<n;++i){
			if(s.charAt(i)=='.'&&first==true)++whitecount;
			else if (s.charAt(i)=='#'){
				first=true;
				++blackcount;
			}

			if(s.charAt(n-1-i)=='#'&&right==false)++rightcount;
			else if(s.charAt(n-1-i)=='#')right=false;

		}
		System.out.println(Math.min(Math.min(whitecount, blackcount),rightcount));


	}
}