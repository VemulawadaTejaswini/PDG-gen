import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		int[] k1=new int[5];
		int i;
			try{
				i=0;
				str=bfr.readLine();
				stk=new StringTokenizer(str," ");

				while(stk.hasMoreTokens()) {
					k1[i]=Integer.parseInt(stk.nextToken());
					i++;
				}

				int set1_nomi;
				if(k1[0]%k1[1]!=0) {
					set1_nomi=k1[0]/k1[1]+1;
				}
				else {set1_nomi=k1[0]/k1[1];}


				int set2_nomi;
				if(k1[0]%k1[3]!=0) {
					set2_nomi=k1[0]/k1[3]+1;
				}
				else {set2_nomi=k1[0]/k1[3];}

				int set2_kosu;
				int saiyasune=1999999999;
				for(int jj=0; jj<set1_nomi+1; jj++) {
					set2_kosu=(k1[0]-jj*k1[1])%k1[3];
					if(set2_kosu!=0) {
						set2_kosu=(k1[0]-jj*k1[1])/k1[3]+1;
					}
					else {
						set2_kosu=(k1[0]-jj*k1[1])/k1[3];
					}
					if(saiyasune>jj*k1[2]+set2_kosu*k1[4]) {
						saiyasune=jj*k1[2]+set2_kosu*k1[4];
					}
				}

				int set1_kosu;
				int saiyasune_2=1999999999;
				for(int jj=0; jj<set2_nomi+1; jj++) {
					set1_kosu=(k1[0]-jj*k1[3])%k1[1];
					if(set1_kosu!=0) {
						set1_kosu=(k1[0]-jj*k1[3])/k1[1]+1;
					}
					else {
						set1_kosu=(k1[0]-jj*k1[3])/k1[1];
					}
					if(saiyasune_2>jj*k1[4]+set1_kosu*k1[2]) {
						saiyasune_2=jj*k1[4]+set1_kosu*k1[2];
					}
				}
				System.out.println(Math.min(saiyasune, saiyasune_2));
			}
			catch(IOException e) {
				System.exit(0);
				}
			catch(NumberFormatException ee) {
				System.exit(0);
			}

			catch(NullPointerException eee) {
				System.exit(0);
			}
		}
}
