import java.util.*;
class main{
	Scanner sc=new Scanner(System.in);
	void main(){
		int Q=sc.nextInt();
		for(int i=0;i<Q;i++){
			int c=sc.nextInt();
			int a=sc.nextInt();
			int n=sc.nextInt();
			int ans=0;
			while(true){
				if(c>=1&&a>=1&&n>=1){
					c--;a--;n--;
					ans++;
				}else if(c>=2&&a>=1){
					c-=2;a--;
					ans++;
				}else if(c>=3){
					c-=3;
					ans++;
				}else break;
			}
			System.out.println(ans);
		}
	}
	public static void main(String[]arg){
		new main().main();
	}
}