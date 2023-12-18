import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] list = new int[3*N];
    int num = 0;
    for(int i=0;i<N;i++){
      num = sc.nextInt();
      list[3*i] = num-1;
      list[3*i+1] = num;
      list[3*i+2] = num+1;
    }
    contains(list);
  }
  public static void contains(int[] lst){
    int length = lst.length;
    int max = 0;
    int head = 0;
    int count = 0;
    for(int i=0;i<length;i++){
      count = 0;
      head = lst[i];
      for(int m=0;m<length;m++){
        if(head==lst[m]){
          count++;
        }
      }
      if(max<count){
        max = count;
      }
    }
    System.out.println(max);
  }
}