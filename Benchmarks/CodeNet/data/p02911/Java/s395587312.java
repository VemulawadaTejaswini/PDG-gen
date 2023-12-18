import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //参加者N人
    int K = sc.nextInt(); //初期ポイントK点
    int Q = sc.nextInt(); //Q回のポイント変動
    int num[] = new int[N];
    for(int j=0;j<N;j++){
      num[j] = K;
    }
    int correct[] = new int[Q];
    
    for(int i=0;i<Q;i++){
      correct[i] = sc.nextInt();
      for(int k=0;k<N;k++){
        if(k+1==correct[i]){
        }else{
          num[k] -= 1;
        }
      }
    }
    
    for(int p=0;p<N;p++){
      if(num[p]>0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}