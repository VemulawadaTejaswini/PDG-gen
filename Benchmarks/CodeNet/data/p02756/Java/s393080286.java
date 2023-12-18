import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int T=sc.nextInt();
		int m=0;
		for(int i=0;i<T;i++){
			int n=sc.nextInt();
			if(n==2){
				int d=sc.nextInt();
				String c=sc.next();
				if(m==0){
					if(d==1){
						s=c+s;
					}else{
						s=s+c;
					}
				}else{
					if(d==1){
						s=s+c;
					}else{
						s=c+s;
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
			System.out.println(s);
		}else if(m==1){
			for(int i=s.length()-1;i>=0;i--){
				System.out.print(s.charAt(i));
			}
		}
	}

}
