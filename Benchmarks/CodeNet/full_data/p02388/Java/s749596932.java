class Main
{
  public static void main(String[] args) {
    System.out.println(new Main(Main.readInt(System.in)).cubic());
  }
  
  private static int readInt(java.io.InputStream in) {
    java.io.BufferedReader reader = null;
    int n = 0;
    try {
      reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));
      n = Integer.parseInt(reader.readLine());
    } catch (java.io.IOException e) {
      e.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (java.io.IOException e) {
          e.printStackTrace();
        }
      }
    }
    return n;
  }
  
  private final int x;
  private Main(int x) {
    this.x = x;
  }
  private int cubic() {
    return x * x * x;
  }
}