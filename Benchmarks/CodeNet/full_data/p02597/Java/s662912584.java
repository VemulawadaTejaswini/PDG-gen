import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String c = sc.next();
    sc.close();
    int[] w_cnt = new int[n];
    for(int i = 0; i < c.length(); i++){
      if(i != 0){
        w_cnt[i] = w_cnt[i - 1];
      }
      if(c.charAt(i) == 'W'){
        w_cnt[i]++;
      }
    }
    System.out.println(w_cnt[w_cnt[w_cnt.length - 1]]);
  }
}