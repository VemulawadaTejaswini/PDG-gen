import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    DataInputStream d = new DataInputStream(System.in);
    String s = d.readLine();
    int i = Integer.parseInt(s);
    System.out.println(i * i * i);
  }
}