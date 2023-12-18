import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int[] v1 = new int[100001];
        int[] v2 = new int[100001];
        for(int i=0; i<100001; i++){
          v1[i] = 0;
          v2[i] = 0;
        }
		int n = sc.nextInt();
        for(int i=0; i<n/2; i++){
          int index1 = sc.nextInt();
          int index2 = sc.nextInt();
          v1[index1] += 1;
          v2[index2] += 1;
        }
        int max1_v1_val = -1;
        int max1_v1_cnt = -1;
        int max2_v1_val = -1;
        int max2_v1_cnt = -1;
        int max1_v2_val = -1;
        int max1_v2_cnt = -1;
        int max2_v2_val = -1;
        int max2_v2_cnt = -1;
        for(int i=1; i<100001; i++){
          if(max1_v1_cnt < v1[i]) {
            max1_v1_cnt = v1[i];
            max1_v1_val = i;
          }
          if(max1_v2_cnt < v2[i]) {
            max1_v2_cnt = v2[i];
            max1_v2_val = i;
          }
        }
        for(int i=1; i<100001; i++){
          if(i == max1_v2_val) i++;
          if(max2_v1_cnt < v1[i]) {
            max2_v1_cnt = v1[i];
            max2_v1_val = i;
          }
          if(max2_v2_cnt < v2[i]) {
            max2_v2_cnt = v2[i];
            max2_v2_val = i;
          }
        }
        if( (max1_v1_cnt + max1_v2_cnt) == n ) {
          if(max1_v1_val == max1_v2_val)
            System.out.println(n/2);
          else
            System.out.println(0);
          System.exit(0);
        }
        if(max1_v1_cnt != max1_v2_cnt) {
          System.out.println(n - max1_v1_cnt - max1_v2_cnt);
          System.exit(0);
        }
        if(max1_v1_val == max1_v2_val &&
           max1_v1_cnt == max1_v2_cnt)
        {
          if(max2_v1_cnt >= max2_v2_cnt){
            System.out.println(n - max1_v1_cnt - max2_v1_cnt);
          } else {
            System.out.println(n - max1_v1_cnt - max2_v2_cnt);
          }
        }
	}
}
