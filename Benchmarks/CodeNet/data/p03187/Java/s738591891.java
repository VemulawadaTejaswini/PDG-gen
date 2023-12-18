import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
	static int[] memo;
	static int[] dp;
	static long ans = 0;
	static int l;
	static int n;
	static ArrayList<Integer> data;
	static ArrayList<Integer> re;



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		l = sc.nextInt();
		n = sc.nextInt();
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i = 0;i < n;i++){
			int x = sc.nextInt();
			data.add(x);
		}
		Collections.sort(data);
		ArrayList<Integer>	re = new ArrayList<Integer>();
		for(int i= 0;i < n;i++){
			int x = data.get(n-1-i);
			re.add(x);
		}

		dfs(data,re,0,0,0l);
		System.out.println(ans);
	}

	static void dfs(ArrayList<Integer> data, ArrayList<Integer> re,int p, int count,long sum){
		int tokeidis = 0;
		int hantokeidis = 0;
		

		if(count == n){
			ans = Math.max(ans, sum);
			return;
		}


		tokeidis = data.get(0) - p;
		if(tokeidis < 0){
			tokeidis = l - p + data.get(0);
		}
		hantokeidis = p + l- re.get(0);

		if(p > re.get(0)){
			hantokeidis = p-re.get(0);
		}
		
		if(tokeidis > hantokeidis ){
			p = data.get(0);
			data.remove(0);
			re.remove(re.size()-1);
			sum += tokeidis;
			dfs(data, re, p, count+1, sum);
		}else if(tokeidis < hantokeidis){
			p =re.get(0);
			re.remove(0);
			data.remove(data.size()-1);
			sum += hantokeidis;
			dfs(data, re, p, count+1, sum);

		}else{

			ArrayList<Integer> subdata = (ArrayList<Integer>) data.clone();
			ArrayList<Integer> subre = (ArrayList<Integer>) re.clone();

		
			p = data.get(0);
			data.remove(0);
			re.remove(re.size()-1);
			sum += tokeidis;
			dfs(data,re,p,count+1,sum);
			data.add(0, p);			//修復
			re.add(p);
			sum -= tokeidis;


			
			p =subre.get(0);
			subre.remove(0);
			subdata.remove(subdata.size()-1);
			sum += hantokeidis;
			
			dfs(subdata, subre, p, count+1, sum);



		}




	}





}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}
