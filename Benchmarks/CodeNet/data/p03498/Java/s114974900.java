import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			int abs = 0, ind = -1, num = 0;
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
				if(abs <= Math.abs(data[i])){
					ind = i;
					abs = Math.abs(data[i]);
				}
			}
			num = data[ind];
			
			int count  =0;
			StringBuilder sb = new StringBuilder();
			if(data[ind] < 0){
				for(int i = n-2; i >= 0; i--){
					while(true){
						if(data[i] <= data[i + 1]) break;
						data[i] = data[i] + num;
						sb.append(ind + 1 + " " + (i + 1)+ "\n");
						count++;
					}
				}
			}
			else{
				for(int i = 1; i < n; i++){
					while(true){
						if(data[i-1] <= data[i]) break;
						data[i] = data[i] + num;
						sb.append(ind + 1 + " " + (i + 1) + "\n");
						count++;
					}
				}
			}
			System.out.println(count);
			if(count > 0){
				System.out.print(sb.toString());
			}
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
