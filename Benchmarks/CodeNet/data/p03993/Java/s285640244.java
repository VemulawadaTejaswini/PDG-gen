import java.util.Scanner;
import java.io.IOException;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
  public static void main(String[] args)throws IOException{
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      int N = Integer.parseInt(br.readLine());
      String str = br.readLine();
      int[] rabbit = Arrays.stream(str.split("\\s"))
                              .mapToInt(Integer::parseInt)
                                .toArray();
      int count=0;
      for(int i=0;i<rabbit.length;i++){
        for(int j=0;j<rabbit.length;j++){
          if(i != j && i == rabbit[j]-1 && rabbit[i]-1 == j) count++;
        }
      }
      System.out.println(count/2);

    }
  }
}
