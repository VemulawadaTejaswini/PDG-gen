import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String st=sc.next();
		char nn[]=st.toCharArray();
		int n[]=new int[3];
		for(int i=0;i<3;++i){
			n[i]=Character.getNumericValue(nn[i]);
		}

		if(n[1]<=n[0] && n[2]<=n[0]){
			System.out.print(n[0]);
			System.out.print(n[0]);
			System.out.println(n[0]);
		}
		else {
			System.out.print(n[0]+1);
			System.out.print(n[0]+1);
			System.out.println(n[0]+1);
		}



	}
}
