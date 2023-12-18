import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
        boolean fa = true;
        if(a == b){
            if(a != c){
                fa = true;
            }else{
                fa = false;
            }
        }else if(b == c){
                fa = true;
        }else{
            fa = false;
        }
        

        if(fa){
		System.out.println("Yes");
        }else
        System.out.println("No");
        
	}
}