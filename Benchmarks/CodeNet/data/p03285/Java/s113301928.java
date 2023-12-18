import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		for(int i=0;i<26;i++){
		for(int j=0; j< 15; j++){
		        if(4 * i + 7* j == n){
		           System.out.println("Yes");
		           return;
		        }
			}
		}
		System.out.println("No"); 
	}
}