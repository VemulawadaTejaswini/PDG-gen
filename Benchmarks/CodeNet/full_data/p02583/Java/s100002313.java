

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long list[] = new Long[n];
		for(int i=0;i<n;i++) {
			list[i] = sc.nextLong();
		}
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(list[i] != list[j] && list [j] != list[k] && list[k] != list [i]) {
						if(list[i]  < list[j] + list[k] && list[j] < list[i] + list[k] && list[k]<list[i] + list[j]) {
							count++;
						}
				}
			}
		}
		}
		System.out.println(count);
	}

}
