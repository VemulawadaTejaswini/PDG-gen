import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int N=scan.nextInt();
		int[] H=new int[N];
		
		for (int i=0;i<N;i++) {
			H[i]=scan.nextInt();
		}
		int max=0;
		int count=0;
		int last=H[0];
		
		for(int i=1;i<H.length;i++) {
			if (last>=H[i]) {
				count+=1;
				if (count>max) {
					max=count;
					
				}
				
			}else {
				count=0;
			}
		last=H[i];
		}
		System.out.print(max);
}

}