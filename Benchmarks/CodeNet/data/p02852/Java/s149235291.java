import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String s=sc.next();
		ArrayList<Integer> ans=new ArrayList<>();
		int state=n;
		while(true){
			if(state-m<=0){
				ans.add(state);
				break;
			}
			int k=state-m;
			while(true){
				if(s.charAt(k)=='0'){
					break;
				}
				k++;
				if(k==state){
					System.out.println(-1);
					return;
				}
			}
			ans.add(state-k);
			state=k;
		}
		for(int i=ans.size()-1; i>=0; i--){
			System.out.print(ans.get(i)+" ");
		}
	}
}
