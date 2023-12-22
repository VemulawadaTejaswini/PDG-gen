import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			boolean [] data = new boolean[11];
			data[a] = true;
			data[b] = true;
			data[c] = true;
			int sum = a + b;
			int count = 0;
			for(int i = 1; i <= 10; i++){
				if(data[i]) continue;
				if(sum + i <= 20){
					count++;
				}
			}
			double res = (double)count / 7;
			if(res >= 0.5){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}