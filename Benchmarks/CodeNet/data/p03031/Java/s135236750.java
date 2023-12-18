import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();//スイッチ
    int m = sc.nextInt();//電球
    int[] ak = new int[m];//電球に繋がっているスイッチの個数
    int[][] sw = new int[m][n];//電球mに接続しているスイッチの情報
    int[] ju = new int[m]; //電球に繋がっているスイッチ%2が配列内の値の時点灯
    int ans = 0;//条件合致数

    for(int i=0; i<m; i++){
      ak[i] = sc.nextInt();//電球i+1に繋がっているスイッチ個数
      for(int j=0; j<ak[i]; j++){
        sw[i][j] = sc.nextInt(); //繋がるスイッチ番号入力
      }
    }

    for(int k=0; k<m;k++){
      ju[k] = sc.nextInt();//1or0を入力
    }

    for(int i=0; i< (1<<n); i++){//スイッチの全ビット探索
      int[] swon = new int[m];//電球に繋がっているonの数
      for(int j=0; j<n;j++){//jビット左論理シフト

        if((1&i>>j)==1){//スイッチj+1がonかoffか
          for(int k=0; k<m;k++){//k+1=電球番号
            for(int l=0; l<ak[k];l++){
              if(sw[k][l]==j+1){
                swon[k] = swon[k] + 1;
              }
            }
          }

        }

      }
      // for(int p=0; p<m;p++){
      //   System.out.println("*"+swon[p]);
      // }
      //全ての電球が点灯したかの判定
      boolean judge = false;
      int count=0;
      for(int p=0;p<m;p++){
        if(swon[p]%2 == ju[p]){
          count +=1;
        }
      }
      if(count==m){
        ans += 1;
      }


    }

    System.out.println(ans);


  }
}