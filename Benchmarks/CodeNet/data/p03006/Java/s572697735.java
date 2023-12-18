import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		HashMap <String,Integer> p=new HashMap<String,Integer>();
		Deque <String> hoge=new ArrayDeque<String>();
		int N=stdIn.nextInt();
		int a[][]=new int[N][2];
		String s="";
		int z=0,y=0,X=0,Y=0,max=0,k=0;
		while(z<N){
			a[z][0]=stdIn.nextInt();
			a[z][1]=stdIn.nextInt();
			z++;
		}z=0;
		while(z<N){
			while(y<N){
				if(z!=y){
					X=a[z][0]-a[y][0];
					Y=a[z][1]-a[y][1];
					s=X+","+Y;
					if(p.containsKey(s))
						p.put(s,p.get(s)+1);
					else{
						p.put(s,1);
						hoge.add(s);
					}
				}
				y++;
			}y=0;
			z++;
		}z=0;
		k=hoge.size();
		while(z<k){
			s=hoge.poll();
			if(p.get(s)>max){
				max=p.get(s);
			}
			z++;
		}
		if(N-max==0)
			N++;
		System.out.println(N-max);
	}
}