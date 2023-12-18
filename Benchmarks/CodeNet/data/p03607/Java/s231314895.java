import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());scan.nextLine();
		Set<Integer> hash_set = new HashSet<Integer>();

		int a;
		int ans=0;
		for (int i = 0;i < n; ++i){
			a = Integer.parseInt(scan.next());scan.nextLine();
			if (hash_set.contains(a)){
				--ans;
				hash_set.remove(a);
			}else{
				hash_set.add(a);
				++ans;
			}

		}




		System.out.print(ans);



	}
}
//end
