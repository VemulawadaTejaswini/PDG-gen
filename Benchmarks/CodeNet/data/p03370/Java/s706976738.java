import java.util.*;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
             int loop = sc.nextInt();
      int  max_num = sc.nextInt();

      int arr [] = new int [loop];
      for(int i = 0; i < loop; i++) {
 arr[i] = sc.nextInt();
}

// 最小値を求める
int min = arr[0];
      for(int i = 0; i < loop; i++) {
          if(min > arr[i]) { 
                     min  = arr[i];
     }
}
// System.out.println(min);  // 最小値　取得

//------ 1回はドーナツ　作成
for(int i = 0; i < loop; i++) {
       max_num -= arr[i];
}

int count = 0;
while(max_num  > min) {
           max_num -= min;
           count++;
    }

int sum = count + loop;
System.out.println(sum);
     }
} //-------- END Main