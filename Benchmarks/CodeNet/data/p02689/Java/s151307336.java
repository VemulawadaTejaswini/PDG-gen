import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tenboudai = sc.nextInt();
		int miti = sc.nextInt();
      	int[] hyoukou = new int[tenboudai];
      	int ans = 0;
      	for (int i=0; i<tenboudai; i++){
        	int c = sc.nextInt();
         	hyoukou[i] = c;
        }
      	for (int i=0; i<miti; i++){
          int a = sc.nextInt();
          int b = sc.nextInt();
          if (b == 0){
            ans += 1;
            continue;
          }
          if (hyoukou[a - 1] > hyoukou[b - 1]){
            ans += 1;
          }else if (hyoukou[b - 1] > hyoukou[a - 1]){
            ans += 1;
          }
        }
		System.out.println(ans);
	}
}