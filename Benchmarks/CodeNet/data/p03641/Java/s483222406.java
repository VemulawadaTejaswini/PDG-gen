import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		ArrayList<ArrayList<Integer>> input = new ArrayList<>();
		ArrayList<Integer> first = new ArrayList<>();
		for(int i=0;i<N;i++){
			first.add(io.nextInt());
		}
		input.add(first);
		ArrayList<Integer> ans = new ArrayList<>();
		
		do{
			input = getTwo(input);
			ans.addAll(input.get(0));
			input.remove(0);
		}while(!input.isEmpty());
		
		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i) + ((i==ans.size()-1)?"\n":" "));
		}
		
	}
	
	private ArrayList<ArrayList<Integer>> 
			getTwo(ArrayList<ArrayList<Integer>> list){
		int min = Integer.MAX_VALUE;
		int min_i = 0;
		int min_j = 0;
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.get(i).size();j++){
				if((j&1)==0){
					int num = list.get(i).get(j);
					if(num<min){
						min = num;
						min_i = i;
						min_j = j;
					}
				}
			}
		}
		int next = Integer.MAX_VALUE;
		int next_j = 0;
		for(int j=min_j+1;j<list.get(min_i).size();j++){
			if(((j-min_j-1)&1)==0){
				int num = list.get(min_i).get(j);
				if(num<next){
					next = num;
					next_j = j;
				}
			}
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ArrayList<Integer> ansNums = new ArrayList<>();
		ansNums.add(min);
		ansNums.add(next);
		ans.add(ansNums);
		for(int i=0;i<list.size();i++){
			if(i==min_i){
				ArrayList<Integer> splited = new ArrayList<>();
				for(int j=0;j<list.get(min_i).size();j++){
					if((j==min_j || j==next_j)){
						if(!splited.isEmpty()){
							ans.add(splited);
							splited = new ArrayList<>();
						}
					}else{
						splited.add(list.get(min_i).get(j));
					}
				}
				if(!splited.isEmpty()) ans.add(splited);
			}else{
				ans.add(list.get(i));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}