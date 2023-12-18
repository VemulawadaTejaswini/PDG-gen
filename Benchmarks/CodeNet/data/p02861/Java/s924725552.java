import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int xy[][] = new int[N][N];
    for(int i=0;i<N;i++){
      for(int j=0;j<2;j++){
        xy[i][j] = sc.nextInt();
      }
    }
    double distance = 0;
    for(int i=0;i<N-1;i++){
      for(int j=1+i;j<N;j++){
        double dist = Math.sqrt((xy[i][0]-xy[j][0])*(xy[i][0]-xy[j][0])+(xy[i][1]-xy[j][1])*(xy[i][1]-xy[j][1]));
        distance += dist*2*(N-1);
      }
    }
    double www = 1;
    for(int i=0;i<N;i++){
     www *= (double)(N-i);
    }
    System.out.println(distance/www);
  }
}