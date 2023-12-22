import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			String st=s.next();
			if(st.equals("-"))break;
			int n=s.nextInt();
			for(int i=0;i<n;i++) {
				int h=s.nextInt();
				st=st.substring((h+1)-1)+st.substring(0,h);
			}
			System.out.println(st);
		}
	}
}