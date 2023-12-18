import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		int head = 0;
		int tail = n - 1;
		long sub = 0;
		while(head != tail + 1){
			while(sub <= 0 && head != tail + 1 && head < n){
				sub += (long)a[head++];
			}
			while(sub >= 0 && tail != head - 1 && tail >= 0){
				sub -= (long)a[tail--];
			}
		}

		long min = 0;
		if(sub > 0){
			min = sub;
			while(tail >= 0){
				sub -= (long)2 * a[tail--];
				if(Math.abs(sub) < Math.abs(min)){
					min = sub;
				}else{
					tail++;
					break;
				}
			}
		}else if(head < n){
			min = sub;
			while(true){
				sub += (long)2 * a[head++];
				if(Math.abs(sub) < Math.abs(min)){
					min = sub;
				}else{
					head--;
					break;
				}
			}
		}else{
			min = 0;
		}

		if(head == n){
			min -= 2 * a[n - 1];
		}else if(tail == -1){
			min += 2 * a[0];
		}

		System.out.println(Math.abs(min));
	}
}
