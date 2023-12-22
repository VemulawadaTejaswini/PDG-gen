import java.util.*;
public class Main {
	int n;
	int [] data;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			sc.nextLine();
			data = new int[n];
			HashMap<String, Integer> nametoind = new HashMap<String, Integer>();
			for(int i = 0; i < n; i++){
				String input = sc.nextLine();
				String [] inputarray = input.split(" ");
				data[i] = inputarray.length -1;
				nametoind.put(inputarray[inputarray.length - 1], nametoind.size());
			}
			for(int i =0; i < m; i++){
				String input = sc.nextLine();
				String [] inputarray = input.split("[ .]");
				int x = nametoind.get(inputarray[0]);
				String op = inputarray[3];
				int y = nametoind.get(inputarray[5]);
				boolean ans = true;
				switch(op.charAt(0)){
				case 'c':
					ans = isChild(x,y);
					break;
				case 'p':
					ans = isChild(y,x);
					break;
				case 's':
					ans = isSib(x,y);
					break;
				case 'd':
					ans = isDes(x,y);
					break;
				case 'a':
					ans = isDes(y,x);
					break;
				}
				System.out.println(ans ? "True" : "False");
			}
			System.out.println();
		}
	}

	private boolean isDes(int x, int y) {
		for(int i = y + 1; i < n; i++){
			if(data[i] <= data[y]){
				return false;
			}
			if(i == x){
				return true;
			}
		}
		return false;
	}

	private boolean isSib(int x, int y) {
		if(data[x] != data[y]){
			return false;
		}
		int min = Math.min(x,y);
		int max = Math.max(x,y);
		for(int i = min + 1; i < n; i++){
			if(data[i] < data[x]){
				return false;
			}
			if(i == max){
				return true;
			}
		}
		return false;
	}

	private boolean isChild(int child, int parent) {
		if(data[parent] + 1 != data[child]){
			return false;
		}
		for(int i = parent + 1; i < n; i++){
			if(data[i] <= data[parent]){
				return false;
			}
			if(i == child){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}