import java.io;

class Cubic{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamreader(System.in));
    int a = Integer.parseInt(br.readLine());
    System.out.println(a*a*a);
  }
}