import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] ans = new int[N];
		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		for(int i=N-1;i>=0;i--){
			if(N/2<i+1){
				if(a[i]==1){list.add(i);ans[i]=1;}
			}else{
				int count = 0;
				for(int j=2;j*(i+1)<=N;j++){
					if(ans[j*(i+1)-1]==1)count++;
				}
				if(a[i]==1){
					if(count%2==0){
						list.add(i+1);ans[i]=1;
					}
				}else{
					if(count%2==1){
						list.add(i+1);ans[i]=1;
					}
				}
			}
		}
		if(list.size()==0){
			System.out.println(0);
		}else{
			System.out.println(list.size());
			for(int i=0;i<list.size();i++){
				if(i > 0)System.out.print(" ");
	      System.out.print(list.get(i));
			}
		}
	}
}