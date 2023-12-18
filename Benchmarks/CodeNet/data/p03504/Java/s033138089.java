import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		Program program[] = new Program[N];
		Main main = new Main();
		for (int i=0;i<N;i++) {
			Program temp = main.new Program();
			temp.s= sc.nextInt();
			temp.t= sc.nextInt();
			temp.c= sc.nextInt();
			program[i] = temp;
		}
		Arrays.sort(program);
		int result[] = new int[1000000];
		int beforec =0;
		for (int i=0;i<N;i++) {
			if (program[i].c!=beforec) {
				result[program[i].s-1]++;
			}
			for (int j=program[i].s;j<program[i].t;j++) {
				result[j]++;
			}
			beforec = program[i].c;
		}
		int max =0;
		for (int i=0;i<=100000;i++) {
			if (result[i]>max) {
				max = result[i];
			}
		}
		System.out.println(max);
	}

	public class Program implements Comparable<Program>{
		int s;
		int t;
		int c;
		@Override
		public int compareTo(Program o) {
			if (this.c!=o.c)
				return this.c-o.c;
			return this.s-o.s;
		}

	}

}