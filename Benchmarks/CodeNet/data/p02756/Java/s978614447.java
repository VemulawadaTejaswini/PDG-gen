import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans;
		Integer q,i,t,f,t1;

		t1=0;
		ans=sc.next();
		q=sc.nextInt();

		for (i=0;i<q;i++){
			t=sc.nextInt();
			if(t==1){
				t1++;
			} else{
				f=sc.nextInt();
				if((t1+f)%2==0){
					ans = ans+sc.next();
				} else {
					ans = sc.next()+ans;
				}
			}
		}

		if(t1%2==1){
			StringBuffer ans_buf = new StringBuffer(ans);
			ans=ans_buf.reverse().toString();
		}
		System.out.println(ans);
		sc.close();
	}
}