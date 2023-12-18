import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    Long[] a = Arrays.stream(in.readLine().split(" ")).map(Long::parseLong).toArray(Long[]::new);
    List<Long> queue = new ArrayList<Long>();
    for(int i=0;i<n;i++){
      if(i%2==0){
        queue.add(a[i]);
      }else{
        queue.add(0, a[i]);
      }
    }
    if(n%2==0){
      for(int i=0;i<n;i++){
        System.out.print(queue.get(i));
        System.out.print(" ");
      }
    }else{
      for(int i=0;i<n;i++){
        System.out.print(queue.get(queue.size()-i-1));
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
