import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		int[] alp1=new int[26];
		int[] alp2=new int[26];
		int mjs=Integer.parseInt(bfr.readLine());
		String uketuke=bfr.readLine();
		char[] ret=new char[mjs];
		int max=0;
		int counter=0;
		for(int i=0; i<mjs; i++) {
			ret[i]=uketuke.charAt(i);
		}

		for(int i=0; i<mjs; i++) {
			counter=0;
			for(int j=0; j<i; j++) {
				alp1[ret[j]*1-97]++;
			}
			for(int j=i; j<mjs; j++) {
				alp2[ret[j]*1-97]++;
			}

			for(int j=0; j<26; j++) {
				if(alp1[j]>0 &&alp2[j]>0) {
					counter++;
				}
				alp1[j]=0;
				alp2[j]=0;
			}
			if(counter>max) {
				max=counter;
			}
		}
		System.out.println(max);
	}
}