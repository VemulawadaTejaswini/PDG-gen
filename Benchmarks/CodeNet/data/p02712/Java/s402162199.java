import java.io.*;
class FizzBuzz {
  public static void main(String[] args) throws IOException {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(in);
    String line = reader.readLine();
    
    int i = int.parseInt(line);
    
    for(int k = 1; k <= i; kk){