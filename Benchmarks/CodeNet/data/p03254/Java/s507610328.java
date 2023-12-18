import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
public class Main {
	public static void main(String args[]){
      	Scanner sc = new Scanner(System.in);
      	String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] line1a = line1.split(" ");
        String[] line2a = line2.split(" ");
        int[] line1b = Stream.of(line1a).mapToInt(Integer::parseInt).toArray();
        int[] line2b = Stream.of(line2a).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(line2a);
        int n = line1b[0];
        int x = line1b[1];
        int sum = 0;
  
      int ans = 0;
      for( int i=0; i<line2b.length; i++ ) {
                        sum += line2b[i];
                }
      if(n>=sum){
        ans=n;
      } else {
        for( int j=0; j<line2b.length; j++ ) {
                        sum -= line2b[j];
          while(sum>=0){
          ans=ans +1;
          }
          }
      }
        System.out.println(ans);
    }
}