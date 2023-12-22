import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//scan.useDelimiter(",|?\n");
		int w=scan.nextInt();
		int n=scan.nextInt();
		String input;
		int a,b;
		int[] ans=new int[w];
		for(int i=0;i<w;i++){
			ans[i]=i+1;
		}
		//scan.useDelimiter(",|?\n");-----How!?!?!?
		for(int i=0;i<n;i++){
			input = scan.next();
			a=Integer.parseInt(input.substring(0,input.indexOf(",")));
			//System.out.println(a);
			b=Integer.parseInt(input.substring(input.indexOf(",")+1,input.length()));
			//System.out.println(b);
			a-=1;
			b-=1;
			int temp=ans[a];
			ans[a]=ans[b];
			ans[b]=temp;
		}
		for(int i=0;i<w;i++){
			System.out.println(ans[i]);
		}
	}
}