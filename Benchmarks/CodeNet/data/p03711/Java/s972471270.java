import java.io.*;
import java.util.Arrays;
class Main{
  public static void main(String[]args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    Integer[] a = {1,3,5,7,8,10,12};
    Integer[] b = {4,6,9,11};
    Integer[] c = {2};
    if(Arrays.asList(a).contains(x)&&Arrays.asList(a).contains(y)||
    Arrays.asList(b).contains(x)&&Arrays.asList(b).contains(y)||
    Arrays.asList(c).contains(x)&&Arrays.asList(c).contains(y))
    System.out.println("Yes");
    else System.out.println("No");
  }
}
