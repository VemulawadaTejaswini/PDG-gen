import java.util.Scanner;

public class Main {

	static int count;
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = scan.nextInt();
        }

        //shellSort
        count = 0;
		int m = 0;
		int G[] = new int[N];
		//G = A.clone();

		for(int i = 1; i <= N; i = i*3 + 1){ //シェルはこれでいいらしいイミフ
            G[m] = i;
            m++;
        }

		//出力
		System.out.println(m);

        for(int i= m-1; i >= 0; i--){
            System.out.print(G[i]);
            if(i > 0){
                System.out.print(" ");
            } else {
                System.out.println();
                }
            }

		//for(int i = m-1; i >= 0; i--){
          //  System.out.print((i == m-1 ? "" : " ") + G[i] + (i == 0 ? "\n" : ""));
        //}

        //sort
        for(int i = m-1; i >= 0; i--) {
			insertionSort(A, N, G[i]);
		}

        System.out.println(count);

        //結果出力
        for(int i = 0; i < A.length; i++) {
        	System.out.println(A[i]);
        }
	}

	public static void insertionSort(int[] A, int n, int g){
		for(int i = g; i < n; i++) {
			int v = A[i];
			int j = i - g;

			while(j >= 0 && A[j] > v) {
				A[j+g] = A[j];
				j = j - g;
				count++;
			}
				A[j+g] = v;

			}
		}
	}
