
import java.util.*;


	public class Main {
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			long N = Integer.parseInt(sc.next());
			int Ma = Integer.parseInt(sc.next());
			int Mb = Integer.parseInt(sc.next());
			int[][] abc;
			int a;
			int b;
			int c;
			int answer=-1;
			for(int i = 0;i<N;i++){
				abc[i][0]=Integer.parseInt(sc.next());
				abc[i][1]=Integer.parseInt(sc.next());
				abc[i][2]=Integer.parseInt(sc.next());
			}
			for(long i = 1;i<(1+2^N);i++){
				a=0;b=0;c=0;
				for(int j = 0;j<N;j++){
					if(((i-(i/(2^j))*(2^j))/(2^(j-1)))==0){
						a=a+abc[i][0];
						b=b+abc[i][1];
						c=c+abc[i][2];
						}
				}
				if((Ma*b-Mb*a)==0){
					if(answer==-1){
						answer=c;
					} else{
						answer=Math.min(answer, c);
					}
				}
			}			System.out.println(answer);
			sc.close();
		}	//private static final int imax = 110;
	
}


