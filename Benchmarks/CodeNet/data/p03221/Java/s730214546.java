import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p;
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] city = new int[n+1][100000];
		ArrayList<Integer> citylist = new ArrayList<Integer>();
		HashMap<Integer,Integer> cityrank = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> city_prefec = new HashMap<Integer,Integer>();
		int[] citycnt = new int[n+1]; //lengthでできる
		for(int i = 0;i < m;i ++) {
			int cnt = 0;
			p = sc.nextInt();
			city[p-1][citycnt[p-1]] = sc.nextInt();
			citylist.add(city[p-1][citycnt[p-1]]);
			cityrank.put(city[p-1][citycnt[p-1]], 1);
			city_prefec.put(city[p-1][citycnt[p-1]], p);
			for(int k = 0;k < citycnt[p-1];k++) {
				if(city[p-1][k] >= city[p-1][citycnt[p-1]]) {
					cityrank.put(city[p-1][k], cityrank.get(city[p-1][k])+1);
					cnt++;
				}else {
					cityrank.put(city[p-1][citycnt[p-1]], cityrank.get(city[p-1][k])+1);
				}
			}
			//if()
			citycnt[p-1]++;
		}
		for(int i = 0;i < m;i ++) { //県
			for(int k = 0;k < citycnt[i]; k++) {
				System.out.println(city[i][k]);
				//System.out.println();
			}
		}
		System.out.println(cityrank);
		/*for(int i = 0;i < m;i ++) { //県
			for(int k = 0;k < citycnt[i]; k++) {
				
				int plength = String.valueOf(i+1).length();
				int xlength = String.valueOf(tcnt).length();
				String s = "";
				for(int j = 0;j < 6-plength;j++) {
					s += "0";
				}
				s += String.valueOf(i+1);
				for(int j = 0;j < 6-xlength;j++) {
					s += "0";
				}
				s += String.valueOf(tcnt);
				System.out.println(s);
			}
		}*/
		for(int i = 0;i < m;i ++) {
			int prefecture = city_prefec.get(citylist.get(i));
			int citynum = cityrank.get(citylist.get(i));
			int plength = String.valueOf(prefecture).length();
			int xlength = String.valueOf(citynum).length();
			String s = "";
			for(int j = 0;j < 6-plength;j++) {
				s += "0";
			}
			s += String.valueOf(prefecture);
			for(int j = 0;j < 6-xlength;j++) {
				s += "0";
			}
			s += String.valueOf(citynum);
			System.out.println(s);
		}
		//System.out.println(city[i][k]);
		//System.out.println();
	}
}