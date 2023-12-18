import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String S=s.next();
		boolean f[]=new boolean[S.length()];
		int i=0;
		int c=0;
		
		
		for(i=0;i<S.length();i++){
			f[i]=true;
			if(S.charAt(i)=='B'&&i!=0){
				if(i!=0)f[i-1]=false;
				f[i]=false;
			}
		}
		for(i=0;i<S.length();i++){
			if(f[i]==true)System.out.print(S.charAt(i));
			else System.out.print(" ");
		}
		

	}

}
