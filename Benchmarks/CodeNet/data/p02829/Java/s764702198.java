import java.io.InputStream;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;
import java.util.StringJoiner;
import java.util.HashSet;
import java.util.Set;
// https://atcoder.jp/contests/abs/tasks/abc081_b
public class Main {
  public static void main(String[] args){
    System.out.println(new Main().excute(System.in)); 
  }
  public String excute(InputStream f) {
    Scanner scan = new Scanner(f);
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    int[] arr = {1, 2, 3};
    return  "" + Arrays.stream(arr)
            .filter(i ->  (i !=  a && i != b))
            .findFirst().getAsInt();
  }
}
