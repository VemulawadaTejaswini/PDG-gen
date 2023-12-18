import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v_i=0;
		double gousei=0;
		
		List<Double> v = new ArrayList<Double>();
		List<Double> v_g = new ArrayList<Double>();
		
		//要素の追加
		for(int i=0;i<n;i++) {
			v_i = sc.nextInt();
			v.add((double)v_i);
		}
		//要素の並び替え
		Collections.sort(v);
		//n-1回の合成作業
		for(int i=0;i<n-1;i++) {
			//最小の二つを組み合わせる
			if(v_g == null || v_g.size()==0) {
				gousei = v.get(0)+v.get(1);
				gousei = gousei/2;
				//上二つを削除して，v_gに追加
				v.remove(0);
				v.remove(0);
				v_g.add(gousei);
				
			
			}else if(v.size()==1) {
				gousei = v.get(0)+v_g.get(0);
				gousei = gousei/2;
			
				
			}else if(v_g.size()==1) {
				if(v.get(1) < v_g.get(0) ){
					gousei = v.get(0)+v.get(1);
					gousei = gousei/2;
					//上二つを削除して，v_gに追加
					v.remove(0);
					v.remove(0);
					v_g.add(gousei);
				}else {
					gousei = v.get(0)+v_g.get(0);
					gousei = gousei/2;
					//上二つを削除して，v_gに追加
					v.remove(0);
					v_g.remove(0);
					v_g.add(gousei);
				}
				
			}else {
				if(v.get(1) < v_g.get(0) ){
					gousei = v.get(0)+v.get(1);
					gousei = gousei/2;
					//上二つを削除して，v_gに追加
					v.remove(0);
					v.remove(0);
					v_g.add(gousei);
				}else if(v.get(0) < v_g.get(1) ){
					gousei = v.get(0)+v_g.get(0);
					gousei = gousei/2;
					//上二つを削除して，v_gに追加
					v.remove(0);
					v_g.remove(0);
					v_g.add(gousei);
				}else {
					gousei = v_g.get(0)+v_g.get(1);
					gousei = gousei/2;
					//上二つを削除して，v_gに追加
					v_g.remove(0);
					v_g.remove(0);
					v_g.add(gousei);
				}
				
			}


			//要素の並び替え
			Collections.sort(v_g);
			
			
		}
		
		
		System.out.println(gousei);
		
		
		
		
		
	}
}