import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int pasta[] =new int[3];
		int juice[] =new int[2];
		int sum=0,min=0;
		for(int i=0;i<5;i++){
			if(i<3){ //３個入れる。
			pasta[i] = sc.nextInt(); //
			}
			else{ //2個入れる。
				juice[i-3] = sc.nextInt(); //i-3にしてjuice[0]から数値を入れる。
			}
		}
		min = pasta[0]+juice[0];
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				sum = pasta[i]+juice[j]; //合計を出す
				if(min > sum){  //最安値と比較
					min = sum; //最安値を更新
				}
			}
		}
		min -= 50; //50円引く
		System.out.println(min);
	}

}