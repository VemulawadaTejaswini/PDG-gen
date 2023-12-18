
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		ArrayList<Integer> h = new ArrayList<Integer>();
		for(int i=0;i<N;i++)
			h.add(sc.nextInt());
		int count = 0;
		while(h.size()>0){
			bomb(h,A,B,maxIndex(h));
			count++;
		}
		System.out.println(count);
	}

	public static void bomb(ArrayList<Integer> h,int A,int B,int target){
		int t = target;
		for(int i=0;i<h.size();i++){
			if(i==t){
				h.set(i,h.get(i)-A);
			}else{
				h.set(i,h.get(i)-B);
			}
			if(h.get(i)<=0){
				h.remove(i);
				t--;
				i--;
			}
		}
	}

	public static int predictDamage(ArrayList<Integer> h,int A,int B,int target){
		int ans = 0;
		for(int i=0;i<h.size();i++){
			if(i==target){
				if(h.get(i)-A>0){
					ans += A;
				}else{
					ans += h.get(i);
				}
			}else{
				if(h.get(i)-B>0){
					ans += B;
				}else{
					ans += h.get(i);
				}
			}
		}
		return ans;
	}

	public static long sumH(ArrayList<Integer> h){
		long ans = 0;
		for(int i=0;i<h.size();i++)
			ans += h.get(i);
		return ans;
	}


	public static int maxIndex(ArrayList<Integer> h){
		int max = 0;
		int index = 0;
		for(int i = 0;i<h.size();i++){
			if(max<h.get(i)){
				max = h.get(i);
				index = i;
			}
		}
		return index;
	}
}
