public class Question {
  public static void main(String[] args){
    String text = args[0];
    String[] num = text.split(" ");
    int A = Integer.parseInt(num[0]);
    int B = Integer.parseInt(num[1]);
    int output = 0;
    if((B % A) == 0){
    	output = A + B;
    }
    else{
      output = B - A;
    }
    System.out.println(output);
  }
}