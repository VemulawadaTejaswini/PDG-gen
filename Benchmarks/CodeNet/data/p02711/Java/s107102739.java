import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l= sc.nextInt();
      	String s = sc.next();
      	//System.out.println(s);
		char[] c=s.toCharArray();
		int r=0;
		int g=0;
		int b=0;
		for(int i=0;i<l;i++){
			if(c[i]=='R'){
				r++;
			}
			if(c[i]=='G'){
				g++;
			}
			if(c[i]=='B'){
				b++;
			}
		}
		long t=0;
		for(int i=0;i<l;i++){
			for(int j=1;j<(l-i)/2;j++){
				if(c[i]!=c[i+j]){
				if(c[i+j]!=c[i+2*j]){
				if(c[i+2*j]!=c[i]){
				t++;
                }
                }
                }
//System.out.println(i);
//System.out.println(j);
			}
		}
		long sum=0;
		sum+=l*(l-1)*(l-2)/6;
		sum-=r*(g*(g-1)/2+b*(b-1)/2);
		sum-=g*(b*(b-1)/2+r*(r-1)/2);
		sum-=b*(r*(r-1)/2+g*(g-1)/2);
      	sum-=r*(r-1)*(r-2)/6;
      	sum-=g*(g-1)*(g-2)/6;
      	sum-=b*(b-1)*(b-2)/6;
      	//System.out.println(sum);
		sum-=t;
//System.out.println(sum);
System.out.println(r*g*b-t);
	}
}