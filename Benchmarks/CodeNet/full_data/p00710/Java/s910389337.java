
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n=0,r=0,p=0,c=0,s=0;
			n=scan.nextInt();
			r=scan.nextInt();
			int[] list = new int[n];
			for(int i=0;i<n;i++){
				list[i]=i+1;
			}
			for(int i=0;i < r;i++){
				p=scan.nextInt();
				c=scan.nextInt();
				if(p==0 && c==0)
					break;

				int[] p_list = new int[p];
				int[] c_list = new int[c];
				System.arraycopy(list, 0, p_list, 0, p);
				System.arraycopy(list, p, c_list, 0, c);
				System.arraycopy(c_list, 0, list, 0, c);
				System.arraycopy(p_list, 0, list, c, p);
			}
			s=list[0];
			System.out.println(s);
		}
	}
}
