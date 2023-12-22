import java.util.Scanner;

public class Main {

	static int N;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			N=cin.nextInt();
			if(N==0)break;
			Digit d =new Digit();
			boolean flag;
			if(N<0){
				flag=true;
				N*=-1;
			}
			else flag=false;
			for(int i = 0;N!=0;i++){
				int n = N%10;
				if(flag){
					if(n!=0){
						d.add(1,i+1);
						d.add(10-n,i);
					}
				}
				else{
					d.add(n, i);
				}
				flag=!flag;
				N=N/10;
			}
			d.output();
		}
	}
}
class Digit{
	int[] num=new int[10];
	void add(int a,int digit){
		if(digit==10)return;
		num[digit]=num[digit]+a;
		if(num[digit]>=10){
			num[digit]=num[digit]-10;
			add(1,digit+1);
		}
	}
	void output(){
		int ans=0;
		for(int i = 0;i<10;i++){
			ans+=num[9-i]*Math.pow(10, 9-i);
		}
		System.out.println(ans);
	}
}