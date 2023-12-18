import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan =new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] a = new int [n];
		for (int i = 0;i < n;++i){
			a[i]=Integer.parseInt(scan.next());
		}
		Arrays.sort(a);
		int target=a[0];
		int count = 1;
		int ans=0;
		for(int i = 1;i < n;++i){
			if (target != a[i]){
				if (count != target){
					if (count>target){
						ans+=count-target;
					}else{
						ans+=count;
					}
				}
				count=1;
				target=a[i];
			}else{
				++count;
			}
		}

		if (count != target){
			if (count>target){
				ans+=count-target;
			}else{
				ans+=count;
			}
		}
		System.out.print(ans);

	}
}
//end
