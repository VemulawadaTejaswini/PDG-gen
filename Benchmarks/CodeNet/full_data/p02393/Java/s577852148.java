import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int[] list = {Integer.parseInt(line[0]),Integer.parseInt(line[1]),Integer.parseInt(line[2])};
    Arrays.sort(list);
    System.out.println(list[0]+" "+list[1]+" "+list[2]);
  }
}