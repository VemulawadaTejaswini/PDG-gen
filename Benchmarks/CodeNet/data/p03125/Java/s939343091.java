public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String text = scan.next();
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