import java.util.Scanner;

public class Main_paiza{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input1 = sc.nextInt();
    // String input2 = sc.nextLine();
    // String[] inputs = input2.split(" ");

    String[] inputs = {"20", "30"};

    int minNum = Integer.parseInt(inputs[0]);
    int maxNum = Integer.parseInt(inputs[1]);

    for(int i = minNum; i <= maxNum; i++){
	    if (i % input1 == 0){
          System.out.println("OK");
          break;
        } else if(i == maxNum &&  i % input1 != 0) {
          System.out.println("NG");
        }
    }
  }
}