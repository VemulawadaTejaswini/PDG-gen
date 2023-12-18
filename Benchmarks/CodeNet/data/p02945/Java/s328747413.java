import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] l = br.readLine().split(" ");
    int a = Integer.valueOf(l[0]);
    int b = Integer.valueOf(l[1]);
    
    int add = a + b;
    int sub = a - b;
    int multi = a * b;
    
    int ret = add;
    if (ret < sub) {
      ret = sub;
    }
    if (ret < multi) {
      ret = multi;
    }
    System.out.printf("%d\n", ret);
  }
}