import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    // 1つ下の桁の数値が8未満の場合は現在の桁を1減算して1つ下の桁の数値を9にする
    
    String str = sc.next();
    int len = str.length();
    int[] eachNum = new int[len];
    for (int i = 0; i < len; i++){
      eachNum[i] = str.charAt(i) - '0';
      // System.out.println(eachNum[i]);
    }

    for (int i = 0; i < len - 1; i++){
      if (eachNum[i + 1] < 8 && eachNum[i] > 0) {
        eachNum[i] = eachNum[i] - 1;
        for(int j = i; j < len - 1; j++){
          eachNum[j + 1] = 9;
        }
      }
    }

    int sum = Arrays.stream(eachNum).sum();
    System.out.println(sum);

  }
}
