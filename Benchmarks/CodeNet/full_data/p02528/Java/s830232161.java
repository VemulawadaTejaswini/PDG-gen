import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];

		upheap(num, n, sc);
		downheap(num, n);
	}

	static void upheap(int[] num, int n, Scanner sc){
		int child;

		for(int i=0; i<n; i++){
			num[i] = sc.nextInt();
			child = i;
			while(child!=0){
				if(num[child]<num[(child-1)/2]){
					swap(num, child, (child-1)/2);
					child = (child-1)/2;
				}else{
					break;
				}
			}
		}
	}

	static void downheap(int[] num, int n){
		int parent;

		for(int i=n-1; i>0; i--){
			System.out.print(num[0] + " ");
			num[0] = num[i];
			parent = 0;
			while(true){
				if(parent*2+1>i-1){
					break;
				}else if(parent*2+1<i){
					if(num[parent*2+1]<num[parent*2+2]){
						if(num[parent*2+1]<num[parent]){ 
							swap(num, parent*2+1, parent);
							parent = parent*2 + 1; 
						}else{
							break;
						}
					}else{
						if(num[parent*2+2]<num[parent]){
							swap(num, parent*2+2, parent);
							parent = parent*2 + 2; 
						}else{
							break;
						}
					}
				}else{
					if(num[parent*2+1]<num[parent]){
						swap(num, parent*2+1, parent);
						parent = parent*2 + 1;
					}
				}
			}
		}
		System.out.println(num[0]);
	}

	static void swap(int[] num, int i, int j){
		int temp;

		temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
}