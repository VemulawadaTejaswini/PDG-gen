import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String[] array = line.split(" ");
    if (!(array.length == 3))
      return;
    int a = Integer.parseInt(array[0]);
    int b = Integer.parseInt(array[1]);
    int c = Integer.parseInt(array[2]);
    if(a < b && b < c) {System.out.print("Yes");}
    else {System.out.print("No");}
  }
}