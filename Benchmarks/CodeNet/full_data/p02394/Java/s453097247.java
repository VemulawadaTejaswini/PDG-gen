import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int w = Integer.parseInt(line[0]);
    int h = Integer.parseInt(line[1]);
    int x = Integer.parseInt(line[2]);
    int y = Integer.parseInt(line[3]);
    int r = Integer.parseInt(line[4]);
    if (r<=x && x<=w-r && r<=y && y<=h-r){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}