import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 1; i <= n; i++){
				list.add(i);
			}
			
			int ind = -1;
			while(true){
				ind = (ind + m) % list.size();
				list.remove(ind);
				ind--;
				if(list.size() == 1){
					System.out.println(list.get(0));
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}