import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		int ans=0;
		for(int i = 0; i<n; i++){
			int a = sc.nextInt();
			if(list.contains(a)){
				ans++;
			}else{
				list.add(a);
			}
		}
		if(ans%2==1){
			ans++;
		}
		System.out.println(n-ans);
	}
}
