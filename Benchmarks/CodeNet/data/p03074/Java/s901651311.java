import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		int ans=0;
		int start=0;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i = 0; i<n; i++){
			if(s.charAt(i)=='0'){
				while(s.charAt(i)=='0'){
					i++;
					if(i==n-1){
						break;
					}
				}
				i--;
				list.add(i);
			}
		}
		int count=0;
		int u=1;
		for(int i :list){
			if(count==0){
				count++;
				continue;
			}
			int j = 0;
			while(s.charAt(i+1)=='1'){
				j++;
			}
			j--;
			
			ans=Math.max(ans,i+j-start);
			u++;
			start=list.get(u);
		}
		System.out.println(ans);
	}
}
