import java.util.stream.Stream;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    String[] inputStr=(new Scanner(System.in)).split(" ");
    int[] input=Stream.of(inputStr).mapToInt(Integer::parseInt).toArray();
    int[] evenArray=new int[]{0,2,4,6,8};
    if(Arrays.AsList(evenArray).contains(input[0])||Arrays.AsList(evenArray).contains(input[1])){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}