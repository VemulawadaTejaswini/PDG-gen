import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list;
    ArrayList<Integer> list2;

    list = new ArrayList<>();
    list2 = new ArrayList<>();
    int pre = 1;
    int n = 1;
    while((pre = n*(n+1)*(n+2)/6)<1000000) {
      n++;
      if(pre%2==1) list.add(pre);
      list2.add(pre);
    }
    int input = 0;

    while((input=scan.nextInt())!=0) {
      int[] dp = new int[input+1];
      System.out.print(calc(input,dp,list2)+" ");
      dp = new int[input+1];
      System.out.println(calc(input,dp,list));
    }
  }

  static int calc(int sum, int[] dp, ArrayList<Integer> list) {
    if(dp[sum]>0) return dp[sum];
    if(sum==0) return 0;
    int max = 0;
    int count = 999999;
    for(int i = list.size()-1; i >= 0; i--) {
      max = list.get(i);
      if(max==sum) return 1;
      if(max<sum) {
        int res = 1 + calc(sum-max,dp,list);
        count = Math.min(res, count);
        dp[sum-max] = res;
      }
    }
    return count;
  }
}