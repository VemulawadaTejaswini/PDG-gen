import java.io.*;

public class Main{
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int w, n;
    try{
      w = Integer.parseInt(reader.readLine());
      n = Integer.parseInt(reader.readLine());
      int[] b = new int[w];
      for(int i = 0; i < w; i++){b[i] = i;}
      for(int i = 0; i < n; i++){
        String a = reader.readLine();
        String[] s = a.split(",", 0);
        swap(Integer.parseInt(s[0]) - 1, Integer.parseInt(s[1]) - 1, b);
      }
      for(int v: b) System.out.printf("%d\n", v + 1);
    }catch(Exception e){}
  }

  public static void swap(int a1, int a2, int[] b){
    int tmp = b[a1];
    b[a1] =  b[a2];
    b[a2] = tmp;
  }
}
