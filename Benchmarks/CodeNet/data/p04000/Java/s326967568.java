import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = Integer.parseInt(scanner.next());
    int W = Integer.parseInt(scanner.next());
    int N = Integer.parseInt(scanner.next());
    int a_i = 0;
    int b_i = 0;
    long[] norms = new long[N*9];

    int index = 0;
    for(int i=0; i<N; i++){
      a_i = Integer.parseInt(scanner.next());
      b_i = Integer.parseInt(scanner.next());
      for(int h=-1; h<=1; h++){
        for(int w=-1; w<=1; w++){
          if((2<=(a_i+h)&&(a_i+h)<=H-1)&&(2<=(b_i+w)&&(b_i+w)<=W-1)){
            norms[index] = (long)(a_i+h)+((long)(b_i+w)<<32);
            index ++;
          }
        }
      }
    }
    scanner.close();

    Arrays.sort(norms);

    int[] ans = new int[10];
    int ans_i = 1;
    for(int i=N*9-index+1; i<9*N; i++){
      if(norms[i-1] == norms[i]){
        ans_i ++;
      }else{
        ans[ans_i] ++;
        ans_i = 1;
      }
      if(i == 9*N-1){
        ans[ans_i] ++;
      }
    }

    long count = 0l;
    for(int i=0; i<10; i++){
      count += ans[i];
    }

    System.out.println(((long)W-2l)*((long)H-2l)-count);
    for(int i=1; i<10; i++){
      System.out.println(ans[i]);
    }
  }
}
