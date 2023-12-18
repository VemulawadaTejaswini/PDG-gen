import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<>();
		int sum= 0;
		for(int i = 0; i < n; i++){
		  int tmp = sc.nextInt();
		  ar.add(tmp);
		  sum += tmp;
		}
		int half = sum / 2;

		int x = 0;
		int y = 0;

		for (int i = 0; i < n ; i++){
		    x += ar.get(i);
		    if (x + ar.get(i+1) > half) {
          int nextx = x + ar.get(i+1);
          int ans1 = sum-x;
          int ans2 = sum-nextx;
          if (ans1<ans2) {
            y=ans1;
            break;
          }else{
            y=ans2;
            break;
          }
        }

		}
		  if ((x-y)<0) {
        System.out.println(-(x-y));

      }else{

        System.out.println(x-y);
      }
    }
}
