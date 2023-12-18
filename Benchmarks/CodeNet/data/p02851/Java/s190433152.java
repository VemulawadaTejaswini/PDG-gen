import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String[] hiki = scan.nextLine().split(" ");
    int N = Integer.parseInt(hiki[0]);
    int K = Integer.parseInt(hiki[1]);
    hiki = scan.nextLine().split(" ");
    int[] array = new int[N];
    for(int i = 0;i < N;i ++){
      array[i] = Integer.parseInt(hiki[i]) % K;
    }
    int count = 0;
    int sum = 0;
    for(int i = 0;i < N;i ++){
      for(int j = i;j < N;j ++){
        sum += array[j];
        sum %= K;
        if(sum == (j - i + 1)) count ++;
      }
    }
    System.out.println(count);
  }
}
