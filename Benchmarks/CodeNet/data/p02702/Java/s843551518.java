import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long cnt = 0;
		int sz = s.length();
		for(int i = 0; i < sz; ++i){
			for(int j = 6; j < 101; ++j){
				String ns = Integer.toString(2019*j);
				int nz = ns.length();
				boolean works = true;
				if(i + nz > sz)break;
				for(int k = 0; k < nz; ++k){
					if(ns.charAt(k) != s.charAt(i+k)){
						works = false;
						break;
					}
				}
				if(works)cnt++;
			}
		}
		System.out.println(cnt);
	}
}
