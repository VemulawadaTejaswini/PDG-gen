import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static int COUNT = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];

		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(br.readLine());
		}

		Main m = new Main();
		m.shellSort(a, n);

		System.out.println(COUNT);

		for(int i = 0; i < n; i++){
			System.out.println(a[i]);
		}

	}

	public void shellSort(int[] a, int n){

		int m = 0;
		int pow = 1;
		int[] g = new int[100];

		while(true){

			if(pow < n){
				g[m] = pow;
			}else{
				break;
			}

			pow = pow * 2;
			m++;

		}

		System.out.println(m);

		for(int i = 0; i < m; i++){

			System.out.print(g[i]);

			if(i != (m - 1)){
				System.out.print(" ");
			}else{
				System.out.print("\n");
			}

		}

		for(int i = m; i >= 0; i--){

			insortionSort(a, n, g[i]);
			COUNT++;

		}

	}

	public void insortionSort(int[] a, int n, int g){

		for(int i = g; i < n; i++){

			int temp = a[i];
			int j = i - g;

			while(j >= 0 && a[j] > temp){

				a[j + g] = a[j];
				j = j - g;
				
			}

			a[j + g] = temp;
			
		}


	}

}