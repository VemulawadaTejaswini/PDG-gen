import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int[][] arr = new int[m][2];
    int[] arr_h = new int[h+1];
    int[] arr_w = new int[w+1];

    for(int i = 0; i<m; i++){
      int h_i = Integer.parseInt(sc.next());
      int w_i = Integer.parseInt(sc.next());
      arr[i][0] = h_i;
      arr[i][1] = w_i;
      arr_h[h_i]++;
      arr_w[w_i]++;
    }

    ArrayList<Integer> h_maxIdx = getMaxIdx(arr_h);
    ArrayList<Integer> w_maxIdx = getMaxIdx(arr_w);

    int ans = arr_h[h_maxIdx.get(0)] + arr_w[w_maxIdx.get(0)];
    int flg = 0;

    for(int i=0; i<h_maxIdx.size(); i++){
      for(int j=0; j<w_maxIdx.size(); j++){
        int judge = 0;
        for(int k=0; k<m; k++){
          if(arr[k][0] == h_maxIdx.get(i) && arr[k][1] == w_maxIdx.get(j)){
            judge=1;
            break;
          }
        }
        if(judge == 1){
          flg = 1;
          break;
        }
      }
    }
    if(flg == 0){
      ans--;
    }

    System.out.println(ans);
   
    sc.close();
    return;
  }

  public static ArrayList<Integer> getMaxIdx(int[] arr){
    ArrayList<Integer> maxIdx = new ArrayList<Integer>();
    int max = -1;
    for(int i = 0; i< arr.length; i++){
        if(arr[i] > max){
          max = arr[i];
          maxIdx = new ArrayList<Integer>();
          maxIdx.add(i);
        }else if(arr[i] == max){
          maxIdx.add(i);
        }
    }
    return maxIdx;
  }
  
  
}
