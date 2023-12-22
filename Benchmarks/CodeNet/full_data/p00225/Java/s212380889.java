
import java.util.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			String [] s = new String[n];
			for(int i = 0 ; i < n; i++){
				s[i] = sc.next();
			}
			ArrayList<ArrayList<Integer>> pass = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < n; i++){
				pass.add(new ArrayList<Integer>());
			}
			for(int i = 0 ; i < n; i++){
				int a = s[i].charAt(0);
				int b = s[i].charAt(s[i].length()-1);
				for(int j = 0 ; j < n; j++){
					int aa= s[j].charAt(0);
					int bb = s[j].charAt(s[j].length() -1);
					if(a == bb){
						pass.get(j).add(i);
					}
					if(b == aa){
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
		int [] in = new int[n];
		int [] out = new int[n];
		for(int i = 0; i < pass.size(); i++){
			in[i] = pass.get(i).size();
		}
		for(int i = 0; i < pass.size(); i++){
			for(int j = 0 ; j < pass.get(i).size(); j++){
				int value = pass.get(i).get(j);
				out[value]++;
			}
		}
		for(int i = 0 ; i < n; i++){
			if(in[i] != out[i] ){
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