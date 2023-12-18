import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H[] = new int[N];
    int bynary[] = new int[N];
    for(int i=0;i<N;i++){
      H[i] = sc.nextInt();
      bynary[i] = 0;
    }
    boolean judge = true;
    int count = 0;
    for(int j=0;j<N-1;j++){
      if(H[j]==H[j+1]){
        H[j] -= 1;
      }else if(H[j]>H[j+1] && bynary[j]==0){
        H[j] -= 1;
        bynary[j+1]++;
      }
      if(H[j]>H[j+1]){
          count++;
          break;
        }
    }
    if(count==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}