import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int[] a = new int[21];
			a[0] = cin.nextInt();
			int L = cin.nextInt();
			if(a[0]==0&&L==0){
				break;
			}
			int i = 1;
			label:while(true){
				String s = a[i-1]+"";
				while(s.length()<L)s+="0";
				char[] c = s.toCharArray();
				Arrays.sort(c);
				int max=0, min=0;
				for(int j=0;j<L;j++)min=min*10+(c[j]-'0');
				for(int j=L-1;j>=0;j--)max=max*10+(c[j]-'0');
				a[i] = max-min;
				//System.out.println(max + " " + min);
				for(int j = i-1; j >= 0;j--){
					if(a[j]==a[i]){
						System.out.println(j+" "+a[i]+" "+(i-j));
						break label;
					}
				}
				i++;
			}
			
		}
	}

}