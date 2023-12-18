import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int count =0;
    int result = 0;
    int minNum =1000000000;
    for(int i=0;i<N;i++){
      int temp = sc.nextInt();
      if(temp<0){
        count++;
        result-= temp;
        temp *= -1;
      }else result+= temp;
      if(minNum > temp){
        minNum=temp;
      }
    }
    if(count%2!=0){
      result = result - 2*minNum;
    }
    System.out.print(result);
  }
}