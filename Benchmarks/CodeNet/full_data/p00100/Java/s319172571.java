import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,tmp;
		int e_num,s_price,s_num,na_list=0,sum=0;

		while(true){
			n = sc.nextInt();
			if(n==0) break;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			ArrayList<Integer> list = new ArrayList<Integer>();

			for(int i=0; i<n; i++){
				e_num = sc.nextInt();
				s_price = sc.nextInt();
				s_num = sc.nextInt();

				if(map.containsKey(e_num)){
					map.put(e_num, (map.get(e_num)+(s_num*s_price)));
				}
				else{
					map.put(e_num, (s_num*s_price));
					list.add(e_num);
				}
			}

			boolean flag = false;
			for(int i=0; i<list.size(); i++){
				tmp = list.get(i);
				if(map.get(tmp) >= 1000000){
					System.out.println(tmp);
					flag = true;
				}
			}
			if(flag == false)
				System.out.println("NA");
		}
	}
}