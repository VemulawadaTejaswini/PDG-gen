import java.util.*;
public class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int w=s.nextInt(),a=w*s.nextInt(),d=s.nextInt(),i[]=new int[a],p[]=new int[a],j=-1,k=d-1;
		while(++j<a)i[s.nextInt()-1]=j;
		while(++k<a)p[k]=p[k-d]+Math.abs(i[k]/w-i[k-d]/w)+Math.abs(i[k]%w-i[k-d]%w);
		int q=s.nextInt();
		while(q-->0)System.out.println(-p[s.nextInt()-1]+p[s.nextInt()-1]);
	}
}