import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int max = 0;
    int min = 123;
    int input;
    for(int i = 0; i < 5; i++){
      input = sc.nextByte();
      max = Math.max(max,input);
      min = Math.min(min,input);
    }
    int k = sc.nextByte();
    if(k >= max - min){
      System.out.println("Yay!");
    }else{
      System.out.println(":(");
    }
  }
}