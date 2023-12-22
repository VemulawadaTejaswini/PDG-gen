import java.util.Scanner;
public class Main {
	void minmaxsum(){
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		long max,min,sum;
		max = -1000001;
		min = 1000001;
		sum = 0;
		for(int j = 0;j < i;j++){
			int tmp = s.nextInt();
			if(max < tmp)max = tmp;
			if(min > tmp)min = tmp;
			sum+=tmp;
		}
		System.out.println(min + " " + max + " " + sum);
	}
	public static void main(String args[]){
		Main m = new Main();
		m.minmaxsum();
	}
}