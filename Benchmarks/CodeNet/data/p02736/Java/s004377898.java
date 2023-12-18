import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    String X=sc.next();
     String[] resultArray = X.split("");
    int Xs[]=new int[N];
    int k=1;
    for(int i=0;i<N;i++){
      Xs[i]= Integer.parseInt(resultArray[i]);
  }
  while(k<=N-1){
  for(int j=1;j<N;j++){
    Xs[j-1]=Math.abs(Xs[j-1]-Xs[j]);
  }
  k++;
}
  System.out.println(Xs[0]);
  }
}
