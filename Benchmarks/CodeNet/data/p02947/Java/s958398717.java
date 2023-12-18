import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i, j;
		String[] a = new String[n];
		for(i=0; i<n; i++)
			a[i] = br.readLine();
		
		long result = 0;
		for(i=0; i<n-1; i++) for(j=i+1; j<n; j++) if( check(a[i], a[j]) )
			result++;
		
		System.out.println(result);
	}
	
	public static boolean check(String a, String b){
		int[] aList = new int[26];
		int[] bList = new int[26];
		int i;
		
		for(i=0; i<a.length(); i++)
			aList[(int)(a.charAt(i)) - 0x60]++;
		for(i=0; i<b.length(); i++)
			bList[(int)(b.charAt(i)) - 0x60]++;
		
		for(i=0; i<26 && aList[i] == bList[i]; i++){}
		
		return i == 26;
	}
}
