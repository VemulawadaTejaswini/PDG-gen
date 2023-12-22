import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] prime = get(100000);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		while(n != -1 || p != -1){
			ArrayList<Integer> res = new ArrayList<Integer>();
			ArrayList<Integer> pl = new ArrayList<Integer>();
			for(int i = n + 1; pl.size() < p; i++){
				if(prime[i]){
					pl.add(i);
				}
			}
			
			for(int i = 0; i < pl.size(); i++){
				for(int j = i; j < pl.size(); j++){
					res.add(pl.get(i) + pl.get(j));
				}
			}
			Collections.sort(res);
			System.out.println(res.get(p - 1));
			
			n = sc.nextInt();
			p = sc.nextInt();
		}
		sc.close();
	}
	static boolean[] get(int x){
		boolean[] res = new boolean[x * 2];
		Arrays.fill(res, true);
		res[0] = false;
		res[1] = false;
		for(int i = 2; i < res.length; i++){
			if(res[i]){
				for(int j = i + i; j < res.length; j += i){
					res[j] = false;
				}
			}
		}
		return res;
	}
	static LinkedList<Integer> gett(){
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
		for(int i = 100001; list.size() <= size; i++){
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
		return list;
	}
}