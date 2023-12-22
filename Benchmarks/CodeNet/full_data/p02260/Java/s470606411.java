import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
        int n = sc.nextInt();
        String data = sc.next();

        //String???Int????????????
        String[] datas = data.split(" ");
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(datas[i]);
		}

    	selectionSort(A);
	}



	private static void selectionSort(int[] A) {
		int cnt =0;
		for (int i = 0; i < A.length-1; i++) {
			//????°???????????´?????????????
			int minj =i;
			for(int j=i; j<A.length; j++){
				if(A[j] <  A[minj]){
					//????°?????´????????´?????????´??°
					minj = j;
				}
			}
			int tmp = A[i];
			A[i] = A[minj];
			A[minj] = tmp;
			if(i!=minj)cnt++;
		}
		disp(A);
		System.out.println(cnt);
	}



	private static void disp(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i!=a.length-1)System.out.print(" ");
		}
		System.out.println();
	}

}