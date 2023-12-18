import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			long [] data = new long[n];
			int abs = 0, ind = -1, num = 0;
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
				if(abs <= Math.abs(data[i])){
					ind = i;
					abs = Math.abs((int)data[i]);
				}
			}
			num = (int) data[ind];
			
			int count  =0;
			StringBuilder sb = new StringBuilder();
			if(data[ind] < 0){
				for(int i = n-2; i >= 0; i--){
					while(true){
						if(data[i] <= data[i + 1]) break;
						if(ind <= i){
							data[i] = data[i] + num;
							sb.append(ind + 1 + " " + (i + 1)+ "\n");
						}
						else{
							data[i] = data[i] + data[i+1];
							sb.append(i + 2 + " " + (i + 1) + "\n");
						}
						count++;
					}
				}
			}
			else{
				for(int i = 1; i < n; i++){
					while(true){
						if(data[i-1] <= data[i]) break;
						if(i <= ind){
							data[i] = data[i] + num;
							sb.append(ind + 1 + " " + (i + 1) + "\n");
						}
						else{
							data[i] = data[i] + data[i-1];
							sb.append(i + " " + (i + 1) + "\n");
						}
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
