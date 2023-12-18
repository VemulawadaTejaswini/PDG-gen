import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] jun = new int[N];
    int[] moreHappy = new int[N-1];
    int sum = 0;
    for(int i=0; i<N; i++){
      jun[i] = sc.nextInt();
    }
    for(int i=0; i<N; i++){
      sum += sc.nextInt();
    }
    for(int i=0; i<N-1; i++){
      moreHappy[i] = sc.nextInt();
    }
    for(int i=1; i<N; i++){
      if(jun[i] == jun[i-1] + 1){
        sum += moreHappy[jun[i]-1];
      }
    }
    System.out.print(sum);
  }
}
       
