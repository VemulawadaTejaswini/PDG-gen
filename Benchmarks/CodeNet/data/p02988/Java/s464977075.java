import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();	
		int[]p=new int[n];
		
		//0番目とn番目を除いてループする
      	//2番目に小さい数字をカウントしていく
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=1;i<n-1;i++){
			if(p[i-1]<p[i]&&p[i]<p[i+1]){
				count++;
			}else if(p[i-1]>p[i]&&p[i]>p[i+1]){
				count++;
			}
		}
		System.out.println(count);
		sc.close();		
	}
}