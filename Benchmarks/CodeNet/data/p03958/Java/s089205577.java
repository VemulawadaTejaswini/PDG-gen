import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int T = sc.nextInt();
		sc.nextLine();
		int[] a = new int[T];
		for (int i=0;i<T;i++){
			a[i] = sc.nextInt();
		}
		int count = 0;
		if (T==1){
			count = K-1;
		}
		else if (T==2){
			Arrays.sort(a);
			if (a[0]==a[1]){
				count = 0;
			}
			else{
				count = a[1]-a[0]-1;
			}
		}
		else{
			Arrays.sort(a);
			int head = 0;
			while(true){
				if (head==a.length-2&&a[a.length-1]==a[a.length-2]){
					count = 0;
					break;
				}
				else if(head==a.length-2&&a[a.length-1]!=a[a.length-2]){
					count = a[a.length-1]-a[head]-1;
					break;
				}
				else{
					a[a.length-1] -= a[head];
					a[head] -=a[head];
					head++;
					Arrays.sort(a);
				}

 			}
		}
		System.out.println(count);
	}

}