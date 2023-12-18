import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] p =new int[a];
		int[] q=new int[b];
		int[] r =new int[c]; 
		for(int i=0;i<a;i++){
			p[i]= sc.nextInt();
		}
		for(int i=0;i<b;i++){
			q[i]= sc.nextInt();
		}
		for(int i=0;i<c;i++){
			r[i]= sc.nextInt();
		}
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);
		long[] ps =new long[a+1];
		long[] qs=new long[b+1];
		long[] rs =new long[c+1];
		for(int i=1;i<a+1;i++){
			ps[i]=ps[i-1]+p[a-i];
		}
		for(int i=1;i<b+1;i++){
			qs[i]=qs[i-1]+q[b-i];
		}
		for(int i=1;i<c+1;i++){
			rs[i]=rs[i-1]+r[c-i];
		}
		long[] s=new long[(x+1)*(y+1)];
		for(int i=0;i<x+1;i++){
			for(int j=0;j<y+1;j++){
				if((x+y)-(i+j)>c){
					s[i*(x+1)+j]=0;
				}else{
					s[i*(y+1)+j]=ps[i]+qs[j]+rs[(x+y)-(i+j)];
                }
			}
		}
		Arrays.sort(s);
		System.out.println(s[(x+1)*(y+1)-1]);
    }
}