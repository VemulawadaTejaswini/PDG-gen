import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer a=new StringBuffer(s);
		
		int T=sc.nextInt();
		int m=0;
		for(int i=0;i<T;i++){
			int n=sc.nextInt();
			if(n==2){
				int d=sc.nextInt();
				String c=sc.next();
				
				if(m==0){
					if(d==1){
						a=new StringBuffer(c).append(a);
					}else{
						a=a.append(c);
					}
				}else{
					if(d==1){
						a=a.append(c);
					}else{
						a=new StringBuffer(c).append(a);
					}
				}
			}else if(n==1){
				if(m==0){
					m=1;
				}else{
					m=0;
				}
			}
		}
		if(m==0){
			System.out.println(a);
		}else if(m==1){
			System.out.println(a.reverse());
		}
	}

}
