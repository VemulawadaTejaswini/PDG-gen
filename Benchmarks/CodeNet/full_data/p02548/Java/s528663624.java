import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		int  N= sc.nextInt();
		sc.close();
		int ans=0;		
		for(int a= 1;a<N;a++){
			for(int b= 1; a*b<N;b++){
				ans++;
			}
		}
		
		System.out.println(ans);
		
		
	}

}
