import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{

	public static void bubbleSort(int a[],String sta[]){
		for (int i = 0; i<a.length ; i++ ) {
			for (int j = a.length-1; j>=i+1 ; j-- ) {
				if (a[j] < a[j-1]) {
					int workint = a[j];
					a[j] = a[j-1];
					a[j-1] = workint;

					String workstr = sta[j];
					sta[j] = sta[j-1];
					sta[j-1] = workstr;
				}
			}
		}
	}

	public static void selectionsort(int b[],String stb[]){
		for (int i = 0; i<b.length ; i++ ) {
			int mini = i;
			for (int j = i; j<b.length ;j++ ) {
				if ( b[j] < b[mini]) {
					mini = j;
				}
			}
			int work = b[i];
			b[i] = b[mini];
			b[mini] = work;

			String workst = stb[i];
			stb[i] = stb[mini];
			stb[mini] = workst;
		}
	}

	public static void printseq(String[] st){
		for (int i = 0; i<st.length ; i++ ) {
			if (i == st.length-1) {
				System.out.println(st[i]);
			}else{
				System.out.print(st[i] + " ");
			}
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		String[] str = (br.readLine()).split(" ");

		for (int i = 0; i<n ; i++ ) {
			char ch = str[i].charAt(1);
			num[i] = Integer.parseInt("" + ch);
		}

		int[] bubbleint = new int[n];
		String[] bubblestr = new String[n];
		for (int i = 0; i<n ; i++ ) {
			bubbleint[i] = num[i];
			bubblestr[i] = str[i];
		}

		int[] selectint = new int[n];
		String[] selectstr = new String[n];
		for (int i = 0; i<n ; i++ ) {
			selectint[i] = num[i];
			selectstr[i] = str[i];
		}


		bubbleSort(bubbleint,bubblestr);

		printseq(bubblestr);
		System.out.println("Stable");

		selectionsort(selectint,selectstr);

		printseq(selectstr);
		if (Arrays.equals(bubblestr,selectstr)) {
			System.out.println("Stable");
		}else{
			System.out.println("Not Stable");
		}
	}
}