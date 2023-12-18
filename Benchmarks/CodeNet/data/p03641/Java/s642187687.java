import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Integer> ans;
	public static ArrayList<Integer> a;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new ArrayList<Integer>();
		ans = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			a.add(sc.nextInt());
		}
		sc.close();
		
		for(int i=0; i<n/2; i++){
			solve();
		}
		
		for(int i=0; i<n; i++){
			System.out.print(ans.get(n-i-1) + " ");
		}
	}
	
//	public static void makeData(int pos1, int pos2){
//		for(int i=0; i<data1.size(); i++){
//			if(a_org.get(pos1) < data1.get(i)){
//
//		}
//	}
	
//	public static ArrayList<Integer> solve(ArrayList<Integer> al){
//		int s_pos1=0, s_pos2=0;
//		int s_min = 1000000;
//		for(int i=0; i<al.size(); i+=2){
//			if(al.get(i) < s_min){
//				s_min = al.get(i);
//				s_pos1 = i;
//			}
//		}
//		ans.add(s_min);
//		s_min = 100000000;
//		for(int i=s_pos1+1; i<al.size(); i+=2){
//			if(al.get(i) < s_min){
//				s_min = al.get(i);
//				s_pos2 = i;
//			}
//		}
//		ans.add(s_min);
//		al.remove(s_pos2);
//		al.remove(s_pos1);
//		return al;
//	}
	
	public static void solve(){
		int sum_max=-1, min_max=-1, pos = -1;
		for(int i=0; i<a.size()-1; i++){
			if(a.get(i) == min_max || a.get(i+1) == min_max){
				if(sum_max < a.get(i) + a.get(i+1)){
					if(a.get(i) > a.get(i+1)){
						min_max = a.get(i+1);
					}else{
						min_max = a.get(i);
					}
					sum_max = a.get(i) + a.get(i+1);
					pos = i;
				}
			}
			if(a.get(i) > min_max && a.get(i+1) > min_max){
				if(a.get(i) > a.get(i+1)){
					min_max = a.get(i+1);
				}else{
					min_max = a.get(i);
				}
				sum_max = a.get(i) + a.get(i+1);
				pos = i;
			}
		}
		ans.add(a.get(pos+1));
		ans.add(a.get(pos));
		a.remove(pos+1);
		a.remove(pos);
	}
}
