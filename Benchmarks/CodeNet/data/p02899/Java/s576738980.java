import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int[] o=new int[10];
      	for (int i=1;i<=n;i++){
          int a=sc.nextInt();
          o[a-1]=i;
        }
        for (int i=0;i<n;i++){
			System.out.print(o[i]+" ");
        }
	}
}