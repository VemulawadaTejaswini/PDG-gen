
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] D;
		D=new int[n+1];
		for(int i=0;i<n;i++){
			D[i] = sc.nextInt();
		}
		D[n]=0;
		Arrays.sort(D);


		int max=12*50;
		for(int i=0;i<=n;i++){
			for(int j=0;j<n;j++){
				if(i==j) continue;
				int tmp=-1;
				if(tmp<Math.abs(D[i]-D[j])) tmp = Math.abs(D[i]-D[j]);
				if(tmp<Math.abs((24-D[i])-D[j])) tmp = Math.abs((24-D[i])-D[j]);
				if(tmp<Math.abs(D[i]-(24-D[j]))) tmp = Math.abs(D[i]-(24-D[j]));
				if(tmp<Math.abs((24-D[i])-(24-D[j]))) tmp = Math.abs((24-D[i])-(24-D[j]));
				if(tmp==24) tmp=0;
				System.err.println(tmp);

				if(max>tmp) max=tmp;
			}
		}

		System.out.println(max);
	}

}
