
import java.util.Scanner;


public  class Main  {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		long money = 0; //ここに値を入れる
		for(int i =0; i<N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		boolean flag = false; //trueの時forをスキップ
		int min =0;
		while(M>0) {
			
			if(!flag) {
				for(int i = 0;i<N;i++) {
					if(B[i]<=0) { continue;}
					if(A[i]<A[min]) { min = i;
					flag = true;
					
					}
					
				}
			}
			
			
			if(M>=B[min]) {
				money = money+ B[min]*A[min];
				M = M-B[min];
				B[min] = 0;
				flag = false;
				for(int i =0; i<N;i++) {
					if(B[i]>0)min = i;
				}
				continue;
			}
			money = money+M*A[min];
			M = 0;
			
		}
		System.out.println(money);
		}
			
		
			
		}
		