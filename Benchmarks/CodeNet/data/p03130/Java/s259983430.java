import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int count1 =0;
		int count2 =0;
		int count3 =0;
		int count4 =0;
		for (int i = 0; i < 6; i++) {
			int ab = sc.nextInt();
			if(ab==1){
				count1++;
			}else if(ab==2){
				count2++;
				
			}else if(ab==3){
				count3++;
			}else if(ab==4){
				count4++;
			}
		}

		
		List<Integer> list = new ArrayList<>();
		list.add(count1);
		list.add(count2);
		list.add(count3);
		list.add(count4);
		
		Collections.sort(list);
		// System.out.println(list);

		if(list.get(0)==1&&list.get(1)==1&&list.get(2)==2&&list.get(3)==2){

			System.out.println("YES");
		}else{

			System.out.println("NO");
		}

	}
}
