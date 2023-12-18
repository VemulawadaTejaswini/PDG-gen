import java.util.*;
import java.util.Collections;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int ans = 0;
		int A = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i < H; i++){
			list.add(sc.nextInt());
		}
		for(int j:list){
			ans += j;
		}
		if(ans % 10 != 0){
			System.out.println(ans);
		}else{
			for(int k = 0;k < list.size(); k++){
				if(list.get(k) % 10 != 0){
					A += 1;
				}
			}
			if(A == 0){
				System.out.println(0);
			}else{
				ans = 0;
				Collections.sort(list);
				for(int l = 0;l < list.size(); l++){
					list.remove(l);
					for(int m:list){
						ans += m;
					}
					if(ans % 10 != 0){
							System.out.println(ans);
							break;
						}
				}
			}
		}
	}
}
