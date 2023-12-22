import java.util.*;
public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 call(scan.nextInt());//callへ引数を渡す
	}//main
	public static void call(int n){
		for(int i = 1; i <= n; i++){
			int x = i;
			if(x % 3 == 0){
				//xが3で割り切れる時に出力をする
				System.out.print(" " + i);
			}else{
				while(x != 0){
					if(x % 10 == 3){
						//x/10の余りが3だった時、出力しbreakする
						System.out.print(" " + i);
						break;
					}//if
					x /= 10;
				}//while
			}//if
		}//for
		System.out.println();
	}//call
}