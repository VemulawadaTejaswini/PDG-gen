import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int[] numArray = new int[5];
    for(int i = 0; i < numArray.length; i++){
      numArray[i] = sc.nextInt();
    }

    //output
    for(int i = 0; i < numArray.length; i++){
      if( numArray[i] == 0 ){
        System.out.println(i+1);
        break;
      }
    }

  }
}
