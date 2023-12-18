
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//定義 
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> al = new ArrayList<>();
		for (int i=0; i<n; i++){
			al.add(Integer.parseInt(sc.next()));
		}
		System.out.println(gcdarr(al));;
	}
	
	public static int gcd(int a, int b){
		if(b==0){
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}
	public static int gcdarr(ArrayList<Integer> a){
		int ans = a.get(0);
		for(int i:a){
			ans=gcd(ans,i);
		}
		return ans;
	}

}
