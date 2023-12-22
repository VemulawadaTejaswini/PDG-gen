import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			int d=s.nextInt();
			int S=0;
			for(int i=0;i<600/d;i++){
				S=S+d*d*i*d*i;
			}
			System.out.println(S);
		}
	}
}
//by Tuvshee 12.05.2012
//Integral