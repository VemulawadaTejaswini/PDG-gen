import java.util.Scanner;
public class Main{
	int n,k,cnt,a;
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			while(n!=0){
				cnt=0;
				a=0;
				for(int i=1;i<=n;i++){
					k=sc.nextInt();
					if(k==0 || k==1){
						cnt++;
					}else{
						a++;
					}
				}
				if((n-cnt)>=1){
					System.out.println((a+1));
				}else{
					System.out.println("NA");
				}
				n=sc.nextInt();
			}
	}
	
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}