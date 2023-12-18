import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] count ={0,0,0,0,0};// m a r c h
		String s;
		char ini;
		for (int i = 0;i < n;++i){
			s=scan.nextLine();
			ini = s.charAt(0);
			switch (ini) {
				case 'M':++count[0];
					break;

				case 'A':++count[1];
					break;

				case 'R':++count[2];
					break;
				case 'C':++count[3];
					 break;
				case 'H':++count[4];
					break;
			}
		}
			long ans=0;
			for (int i = 0;i<5;++i){
				for(int k = i+1;k<5;++k){
					for(int j =k+1;j<5;++j){
						ans+=count[i]*count[k]*count[j];
					}
				}
			}
			System.out.print(ans);

	}
}
//end