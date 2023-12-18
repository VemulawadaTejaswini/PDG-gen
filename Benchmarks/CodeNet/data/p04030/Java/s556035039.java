import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String S=s.next();
		boolean f[]=new boolean[S.length()];
		int i=0;
		
		
		for(i=0;i<S.length();i++){
			if(S.charAt(i)=='B'){
				f[i-1]=false;
				f[i]=false;
			}
		}
		for(i=0;i<S.length();i++){
			if(f[i])System.out.print(S.charAt(i));
		}
		

	}

}