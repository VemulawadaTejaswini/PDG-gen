import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] __){
		while(true){
			String in=s.next();
			int length=s.nextInt();
			if(length==0) return;
			
			ArrayList<Integer> list=new ArrayList<>();
			list.add(Integer.parseInt(in));
			in=String.format("%0"+length+"d",list.get(0));
			
			for(int l=1;true;l++){
				char[]buf=in.toCharArray();
				Arrays.sort(buf);
				int
				small=Integer.parseInt(String.valueOf(buf)),
				large=Integer.parseInt(String.valueOf(reverse(buf))),
				i;
				if((i=list.indexOf(large-small))>=0) {
					System.out.printf("%d %d %d\n",i,large-small,l-i);
					break;
				}
				list.add(large-small);
				in=String.format("%0"+length+"d",large-small);
			}
		}
	}
	public static char[] swap(char[] c,int a,int b){
		char x=c[b];
		c[b]=c[a];
		c[a]=x;
		return c;
	}
	public static char[] reverse(char[] c,int l,int r){
		int buf=(l+r+1)/2;
		for(int i=l;i<buf;i++){
			swap(c,i,r-i+l);
		}
		return c;
	}
	public static char[] reverse(char[] c){
		return reverse(c,0,c.length-1);
	}
}