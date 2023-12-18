import java.util.*;
public class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int w=s.nextInt(),a=w*s.nextInt(),d=s.nextInt(),i[]=new int[a],p[]=new int[a];
		for(int j=0;j<a;j++)i[s.nextInt()-1]=j;
		for(int j=d;j<a;j++)p[j]=p[j-d]+Math.abs(i[j]/w-i[j-d]/w)+Math.abs(i[j]%w-i[j-d]%w);
		int q=s.nextInt();
		while(q-->0)System.out.println(-p[s.nextInt()-1]+p[s.nextInt()-1]);
	}
}