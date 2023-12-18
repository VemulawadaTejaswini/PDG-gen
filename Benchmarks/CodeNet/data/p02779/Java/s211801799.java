import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean b = true;
        //HashSetで空の箱を作る
		Set<Integer> set = new HashSet<>();
      
		for(int  i=0; i<N; i++) {
			int a= sc.nextInt();
          //set.addで空の箱に重複を除いたaを追加する
			b =	set.add(a);
		  //bがfalse(重複があるとき)はNO
			if(!b){
				System.out.println("NO");
				return;
			}
		}
		//最後まで重複しなかった場合
		System.out.println("YES");
	}		
}