import java.util.*;

public class Main{
  public static void main(String args[]){
    //入力
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    
    //初期値
    String[] arrayS = S.split("");
    int N = S.length();
	int[] nums = new int[N];
    for(int num: nums){
      num = 0;
    }
    
    int[] RLs = new int[N];
    RLs[0] = 0;
    int countRL = 1;
    
    int[] LRs = new int[N];
    LRs[0] = 0;
    int countLR = 1;
    
    //処理
    for(int i = 0; i < N - 1; i++){
      if("R".equals(arrayS[i]) &&  "L".equals(arrayS[i + 1])){
        //RLの場所
        RLs[countRL] = i;
        countRL++;
      }
      
      if("L".equals(arrayS[i]) && "R".equals(arrayS[i + 1])){
        //LRの場所
        LRs[countLR] = i;
        countLR++;
      }
    }
    
    LRs[countLR] = N - 1;
    
    for(int i = 1; i < N; i++){
      if(RLs[i] == 0 && i > 1){
        break;
      }
      //Lの個数
      int amountL = LRs[i] - RLs[i];
      
      if(amountL % 2 == 0){
        //Lの個数が偶数の場合の集まり方
        nums[RLs[i] + 1] += amountL / 2;
        nums[RLs[i]] += amountL / 2;
      } else {
        //Lの個数が奇数の場合の集まり方
        nums[RLs[i] + 1] += (amountL + 1) / 2;
        nums[RLs[i]] += (amountL - 1) / 2;
      }
      
      if(LRs[i] == 0){
        break;
      }
      
      //Rの個数
      int amountR = RLs[i] - LRs[i - 1];
      if(LRs[i - 1] == 0){
        amountR = RLs[i] - LRs[i - 1] + 1;
      }
      
      if(amountR % 2 == 0){
        //Rの個数が偶数の場合の集まり方
        nums[RLs[i]] += amountR / 2;
        nums[RLs[i] + 1] += amountR / 2;
      } else {
        //Rの個数が奇数の場合の集まり方
        nums[RLs[i]] += (amountR + 1) / 2;
        nums[RLs[i] + 1] += (amountR - 1) / 2;
      }
    }
    
    for(int num: nums){
      System.out.print(num);
      System.out.print(" ");
    }
  }
}
