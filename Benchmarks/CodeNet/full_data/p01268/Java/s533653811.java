
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		for(int i = 3; i < 100000; i++){
			boolean flg = true;
			for(int x : list){
				if(i % x == 0){
					flg = false;
					break;
				}
			}
			if(flg){
				list.add(i);
			}
		}
		int size = list.size() + 100;
		for(int i = 100001; list.size() < size; i++){
			boolean flg = true;
			for(int x : list){
				if(i % x == 0){
					flg = false;
					break;
				}
			}
			if(flg){
				list.add(i);
			}
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		while(n != -1 || p != -1){
			int s = 0;
			for(int i = 0; i < list.size(); i++){
				if(list.get(i) > n){
					s = i;
					break;
				}
			}
			LinkedList<Integer> addlist = new LinkedList<Integer>();
			for(int i = s; i < s + p; i++){
				for(int j = i; j < s + p; j++){
					addlist.add(list.get(i) + list.get(j));
				}
			}
			Collections.sort(addlist);
			System.out.println(addlist.get(p - 1));
			n = sc.nextInt();
			p = sc.nextInt();
		}
		sc.close();
	}

}