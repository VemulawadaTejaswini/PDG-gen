import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] strs = str.split(" ");
    long x = Long.parseLong(strs[0]); // 今いる
    long k = Long.parseLong(strs[1]); // 回数
    long d = Long.parseLong(strs[2]); // 変動量

    boolean isMinus = x < 0;
    long k_tmp = k;

    if(isMinus == (x + (isMinus? 1 : -1) * d * k < 0)){
      System.out.println(Math.abs(x + (isMinus? 1 : -1) * d * k));
      return;
    }

    while(isMinus != (x + (isMinus? 1 : -1) * d * k_tmp < 0) || k_tmp >= 1){
      k_tmp /= 2;
    }

    k -= Math.floor(k_tmp);

    while (x!= 0 && k!=0 && isMinus == (x < 0) ){
      x = x + (isMinus? 1 : -1) * d;
      k--;
    }

    if (k ==0) System.out.println(Math.abs(x));
    else System.out.println(Math.abs(x + (isMinus? -1 : 1) * d * (k % 2)));
  }
}