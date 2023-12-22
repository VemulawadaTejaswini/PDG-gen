import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static int digitNumber(int a, int b){ 
    int sum = a + b;
    String sumString = Integer.toString(sum);
    int digit = sumString.length();
    return digit;
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = new String();
    while ((line = br.readLine()) != null) {
      // 入力をもらう
      String[] inputArray = line.split(" ");
      int answer = digitNumber(Integer.parseInt(inputArray[0]),Integer.parseInt(inputArray[1]));
      System.out.println(answer);
    }   
  }
}