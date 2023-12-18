
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
		Scanner  sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt();
		char a[]=sc.next().toCharArray();
	char b[]=sc.next().toCharArray();
	char c[]=sc.next().toCharArray();
	Arrays.parallelSort(a);
	Arrays.parallelSort(b);
	Arrays.parallelSort(c);
		int min=Math.min(a.length, b.length);
		int wanted=Math.min(c.length,min);
		int freq1[]=new int[27];
		int freq2[]=new int[27];
		int freq3[]=new int[27];
		for(int i=0;i<a.length;i++) {
			freq1[a[i]-'a']++;
		}
		for(int i=0;i<b.length;i++) {
			freq2[b[i]-'a']++;
		}
		for(int i=0;i<c.length;i++) {
			freq3[c[i]-'a']++;
		}
		if(wanted==a.length) {
			String ans="";
			for(int i=0;i<a.length;i++) {
				if(freq1[a[i]-'a']<=freq2[a[i]-'a']&&freq1[a[i]-'a']<=freq3[a[i]-'a']) {
					int temp=freq1[a[i]-'a'];
					while(temp!=0){
						ans+=a[i];
						temp--;
					}
					i+=freq1[a[i]-'a']-1;
				}
			}
			System.out.println(ans);
		}else if(wanted==b.length){
			String ans="";
			for(int i=0;i<b.length;i++) {
				if(freq2[b[i]-'a']<=freq1[a[i]-'a']&&freq2[b[i]-'a']<=freq3[c[i]-'a']) {
					int temp=freq2[b[i]-'a'];
					while(temp!=0){
						ans+=b[i];
						temp--;
					}
					i+=freq1[b[i]-'a']-1;
				}
			}
			System.out.println(ans);
		}else {
			String ans="";
			for(int i=0;i<c.length;i++) {
				if(freq3[c[i]-'a']<=freq1[a[i]-'a']&&freq3[c[i]-'a']<=freq2[b[i]-'a']) {
					int temp=freq3[c[i]-'a'];
					while(temp!=0){
						ans+=c[i];
						temp--;
					}
					i+=freq3[c[i]-'a']-1;
				}
			System.out.println(ans);
		}
		
	}
}
}