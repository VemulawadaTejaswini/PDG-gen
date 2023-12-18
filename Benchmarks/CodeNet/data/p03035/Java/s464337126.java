import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans;
		if(a>=13){
			ans=b;
		}else if(a<13&&a>=6){
			ans=b/2;
		}else{
			ans=0;
		System.out.println(ans);
	}
}