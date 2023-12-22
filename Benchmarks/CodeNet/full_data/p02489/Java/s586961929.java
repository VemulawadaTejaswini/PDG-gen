import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num[] = new int[100];
    int i = -1;

    do{
      i++;
      num[i] = sc.nextInt();
    }while(num[i] != 0);
    
    for(int j = 0; j < i; j++){
      System.out.println("case " + (j + 1) + ": " + num[j]);
    }
  }
}