import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int [] temp = new int[10001];
			int n = sc.nextInt();
			if(n == 0)break;
			
			LinkedList list = new LinkedList<Integer>();
			
			for(int i = 0; i < n; i++){
				int num = sc.nextInt();
				int ans = sc.nextInt() * sc.nextInt();
				temp[num] += ans; 
				list.add(num);
			}
			for(int i = 0; i < list.size(); i++){
				for(int j = 1; j < list.size(); j++){
					if(list.get(i).equals(list.get(j))){
						list.remove(j);
					}
				}
			}
			boolean judge = false;
			for(int i = 0; i < list.size(); i++){
				if(temp[((Integer) list.get(i)).intValue()] >= 1000000){
					System.out.println(list.get(i));
					judge = true;
				}
			}
			if(!judge){
				System.out.println("NA");
			}
		}
	}
}