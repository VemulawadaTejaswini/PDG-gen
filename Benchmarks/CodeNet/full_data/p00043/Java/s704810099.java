import java.util.Scanner;

public class Main {

	static int[] a;
	static int count;
	static int j;
	static boolean first;
	static boolean[] already;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str = cin.next();
			first=true;
			already = new boolean[10];
			label:for(j = 1; j < 10;j++){
				String s = str+j;
				a = new int[10];
				count=14;
				
				for(int i = 0; i < s.length();i++){
					a[(int)(s.charAt(i)-'0')]++;
					if(a[(int)(s.charAt(i)-'0')]>4){
						continue label;
					}
				}
				
				hai();
			}
			if(first){
				System.out.println(0);
			}
			else{
				System.out.println();
			}
		}
	}
	static  void hai(){
		for(int i = 1; i <10;i++){
			//System.out.print(a[i]);
		}
		//System.out.println();
		if(already[j]){
			return;
		}
		// 頭
		if(count==2){
			for(int i = 1;i<=9;i++){
				if(a[i]==2){
					if(!first){
						System.out.print(" "+j);
					}
					else{
						System.out.print(j);
						first=false;
					}
					already[j]=true;
					return;
				}

			}
		}
		
		// 刻子
		for(int i = 1;i<= 9;i++){
			if(a[i]>=3){
				a[i]-=3;
				count-=3;
				hai();
				a[i]+=3;
				count+=3;
			}
		}
		// 順子
		for(int i = 1;i <= 7;i++){
			if(a[i]>0&&a[i+1]>0&&a[i+2]>0){
				a[i]--;
				a[i+1]--;
				a[i+2]--;
				count-=3;
				hai();
				a[i]++;
				a[i+1]++;
				a[i+2]++;
				count+=3;
			}
		}
	}
}