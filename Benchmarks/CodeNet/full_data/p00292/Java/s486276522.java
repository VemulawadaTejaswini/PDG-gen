import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		
		for(int i=0;i<N;i++){
			int k=Integer.parseInt(in.next()),p=Integer.parseInt(in.next());
			while(k>p){
				k-=p;
			}
			System.out.println(k);
		}
	}

}

