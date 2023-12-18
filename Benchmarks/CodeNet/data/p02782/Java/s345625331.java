import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int r1=sc.nextInt();
int c1=sc.nextInt();
int r2=sc.nextInt();
int c2=sc.nextInt();
int ans=0;
for(int x=r1;x<=r2;x++){
	for(int y =c1;y<=c2;y++){
		ans=ans+func(x,y);
	}
}
System.out.println(ans);

}
			
		
		public static  int func(int x,int y){
			if(x==1&&y==1){
				int res=2;
				return res;
			}
			else if (x==y){
				int res=(x*y)+2;
				return res;
			}
			else{
				int res=2+(x*y-1);
				return res;
			}
			
		}
	}

