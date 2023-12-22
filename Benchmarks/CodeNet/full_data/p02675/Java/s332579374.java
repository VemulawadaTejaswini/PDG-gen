import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int A,B,H,M;
    
    try{
      String[] contexts = reader.readLine().split(" ");
      A = Integer.parseInt(contexts[0]);
      B = Integer.parseInt(contexts[1]);
      H = Integer.parseInt(contexts[2]);
      M = Integer.parseInt(contexts[3]);
    }finally{
      reader.close();
    }
    
    // 角度
    int intAngle = Math.abs((360 / 12) * H - (360 / 60) * M);
    
    // 長さ
    double dblLen;
    dblLen += Math.pow(A * 1.0, 2.0)
    dblLen += Math.pow(B * 1.0, 2.0)
    dblLen -= 2.0 * A * B * Math.cos(Math.toRadians(intAngle));
    
    System.out.print(sqrt(dblLen));
  }
}
