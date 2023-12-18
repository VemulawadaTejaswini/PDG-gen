import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
		int y = sc.nextInt();      	
        int p[] = {1,3,1,2,1,2,1,1,2,1,2,1};
        if(p[x - 1] == p[y - 1]){
                System.out.println("Yes");
        }else{
                System.out.println("No");
        }
	}
}