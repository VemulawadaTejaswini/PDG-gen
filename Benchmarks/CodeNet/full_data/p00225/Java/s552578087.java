
import java.util.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			char [] ini = new char[n];
			char [] tail = new char[n];
			for(int i = 0 ; i < n; i++){
				String s = sc.next();
				ini[i] = s.charAt(0);
				tail[i] = s.charAt(s.length()-1);
			}
			ArrayList<ArrayList<Integer>> pass = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < n; i++){
				pass.add(new ArrayList<Integer>());
			}
			for(int i = 0 ; i < n; i++){
				for(int j = 0 ; j < n; j++){
					if(ini[i] == tail[j]){
						pass.get(j).add(i);
					}
					if(tail[i] == ini[j]){
						pass.get(i).add(j);
					}
				}
				
			}
			boolean res = isEuler(pass);
			System.out.println(res ? "OK" : "NG");
		}
	}
	
	private boolean isEuler(ArrayList<ArrayList<Integer>> pass) {
		int n = pass.size();
		int [] out = new int[n];
		for(int i = 0; i < n; i++){
			for(int j = 0 ; j < pass.get(i).size(); j++){
				int value = pass.get(i).get(j);
				out[value]++;
			}
		}
		for(int i = 0 ; i < n; i++){
			if(pass.get(i).size() != out[i] ){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}