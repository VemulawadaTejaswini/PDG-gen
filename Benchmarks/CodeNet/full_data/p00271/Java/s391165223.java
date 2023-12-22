package kyuu1;

import java.util.Scanner;

public class SelectionSort2 {
	Scanner sc = new Scanner(System.in);
	int[] kode = {100,101,102,103,104,105,106,107,108,109};
	int n;
	int m;
	int taihi;
	int soeji;
	int max;

	public void sort(){
		for(n=0;n<kode.length-1;n++){
			soeji = n;
			max = kode[n];
			for(m=n+1;m<kode.length;m++){
				if(max<kode[m]){
					soeji = m;
					max = kode[m];
				}
			}
			if(n != soeji){
				taihi = kode[n];
				kode[n] = kode[soeji];
				kode[soeji] = taihi;
			}
		}
	}
	public void hyouji(){
		for(n=0;n<kode.length;n++){
			System.out.println(kode[n]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SelectionSort2 sele2 = new SelectionSort2();
		sele2.sort();
		sele2.hyouji();
	}

}