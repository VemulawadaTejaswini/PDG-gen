
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int L;
	static int count;
	static int a[]=new int[21];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;

		while(true){
			n=sc.nextInt();
			L=sc.nextInt();
			count=0;
			if(n+L==0) break;
			a[count++]=n;
			f(n);
		}
	}

	static void f(int n){
		String str=Integer.toString(n);
		int k=str.length();
		for(int i=0;i<L-k;i++){
			str="0"+str;
		}
		//System.out.println(str);
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		char ch2[]=str.toCharArray();
		int j=0;
		for(int i=ch.length-1;0<=i;i--){
			ch2[j++]=ch[i];
		}
		int min=Integer.parseInt(String.valueOf(ch));
		int max=Integer.parseInt(String.valueOf(ch2));

		//System.out.println(min+" "+max);
		a[count++]=max-min;
		if(check()) return;
		f(a[count-1]);
	}
	static boolean check(){
		for(int j=0;j<count;j++){
			for(int i=j+1;i<count;i++){
				if(a[j]==a[i]){
					System.out.println(j+" "+a[i]+" "+(i-j));
					return true;
				}
			}
		}
		return false;
	}
}