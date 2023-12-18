
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// 整数の入力

		List<Integer> a = new ArrayList();
		for(int i=0;i<n;i++){
			a.add(sc.nextInt());
		}
		List<Integer> b = new ArrayList();
		for(int i=0;i<n;i++){
			b.add(sc.nextInt());
		}
		List<Integer> c = new ArrayList();
		for(int i=0;i<n;i++){
			c.add(sc.nextInt());
		}
        Collections.sort(a);
        Collections.reverse(a);
        Collections.sort(b);
        Collections.reverse(b);
        Collections.sort(c);
        Collections.reverse(c);

		int count=0;

		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if(a.get(i)>=b.get(j)) break;
				for (int k=0;k<n;k++){
					if(b.get(j)<c.get(k)){
						count++;
					}else{
						break;
					}
				}
			}
		}
		System.out.println(count);
	}

}
