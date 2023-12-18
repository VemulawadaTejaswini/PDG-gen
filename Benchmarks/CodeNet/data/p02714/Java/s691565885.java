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
			for(int j=1;i+2*j<l;j++){
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
      if(l<3){
System.out.println(0);        
      }else{
System.out.println(r*g*b-t);
      }
	}
}