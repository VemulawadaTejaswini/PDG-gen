import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		Queue<Integer> black = new ArrayDeque<Integer>();
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		char a[]=new char[H*W];
		String b="";
		boolean fin=false;
		int z=0,y=0,x=0,i=0,j=0;
		while(z<H*W){
			if(z%W==0){
				b=stdIn.next();y=0;
			}
			a[z]=b.charAt(y);
			if(a[z]=='#')
				black.add(z);
			z++;y++;
		}z=1;y=0;x=black.size();
		while(true){
			while(y<x){
				i=black.poll();
				if(i-W>=0)
					if(a[i-W]=='.'){
						black.add(i-W);
						a[i-W]='#';fin=true;
					}
				if(i+W<H*W)
					if(a[i+W]=='.'){
						black.add(i+W);
						a[i+W]='#';fin=true;
					}
				if(i-1>=0&&i%W!=0)
					if(a[i-1]=='.'){
						black.add(i-1);
						a[i-1]='#';fin=true;
					}
				if(i+1<H*W&&i%W!=W-1)
					if(a[i+1]=='.'){
						black.add(i+1);
						a[i+1]='#';fin=true;
					}
				y++;
			}j+=y;y=0;
			x=black.size();
			if(fin==false)
				z--;
			if(x+j==H*W)
				break;
			fin=false;
			z++;
		}
		System.out.println(z);
	}
}