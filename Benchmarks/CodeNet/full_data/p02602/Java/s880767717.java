import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //学期(総合)
    long n = sc.nextLong();
    //学期(評定を始める基準)
    long k = sc.nextLong();
    //点数
    long[] score = new long[n];
    for(int i = 0; i < n;i++){
      score[i] = sc.nextInt();
    }
    long st = 1;
      //基準
      for(int i = 0;i < k;i++){
        st = st * score[i];
      }
      
      for(int i = 0;i < n - k;i++){
        long ans = 1;
        for(int j = 1 + i;j <= k + i;j++){
          ans = ans * score[j];
        }
        if(ans > st){
          System.out.println("Yes");
          st = ans;
        }else{
          System.out.println("No");
          st = ans;
        }
      }
  }
}
