import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int amari = n%28;
		if(amari == 4){

			System.out.println("Yes");
		}else if(amari == 4){

			System.out.println("Yes");
		}else if(amari %4==0){

			System.out.println("Yes");
			}else if(amari %7==0){

			System.out.println("Yes");
			}else if(amari %4==7){
			System.out.println("Yes");
					}else if(amari %7==4){

			System.out.println("Yes");
									}else{
										System.out.println("No");
									}






	}

	public static boolean isLower(String str) {
		return str.equals(str.toLowerCase());
	}

}