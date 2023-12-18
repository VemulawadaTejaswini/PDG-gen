import java.util.Scanner;
  public class Main{
    public static void main(String[] args){
     Scanner sc = new Scanner();
     int n = sc.nextInt();
    //int n = 40;
    int max = 1000;
    int answer = 0;
    for(int i = 1;i<max;i++){
      if((i%n == 0) && (i%2 == 0)){
        answer = i;
        break;
      }
    }
    System.out.println(answer);
  }
}
