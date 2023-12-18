import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int in[] = new int[a];
        for (int i = 0; i < a; i++) {
          in[i] = sc.nextInt();
        }
      
      	int choco = 0;
        for (int j = 0; j < in.length; j++) {
          int cal = b1 / in[j];
          int cal2 = b1 % in[j];
          choco += (cal2 != 0 ? (cal + 1) : cal);
        }
      
		// 出力
		System.out.println(choco + b2);
	}
}