import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[] num = new int[n];
			for(int i=0;i<n;i++){
				num[i] = stdIn.nextInt();
			}
			int cnt = 0;
			while(true){
				boolean flag = true;
				int[] source = new int[n];
				int[] before = new int[n];
				for(int i=0;i<n;i++){
					source[i] = num[i];
					before[i] = num[i];
				}
				for(int i=0;i<n;i++){
					int cnt2 = 0;
					for(int j=0;j<n;j++){
						if(source[i]==source[j]){
							cnt2++;
						}
					}
					num[i] = cnt2;
				}
				for(int i=0;i<n;i++){
					if(source[i]!=num[i]){
						flag = false;
						break;
					}
				}
				if(flag){
					break;
				}
				cnt++;
			}
			System.out.println(cnt);
			for(int i=0;i<n-1;i++){
				System.out.print(num[i]+" ");
			}
			System.out.println(num[n-1]);
		}
	}
}