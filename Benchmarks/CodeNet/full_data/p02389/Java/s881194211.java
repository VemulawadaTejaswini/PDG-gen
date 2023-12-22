class Main
{
  public static void main(String[] args) {
    java.io.BufferedReader reader = null;
    try {
      reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
      String[] inputs = reader.readLine().split(" ");
      int a = Integer.parseInt(inputs[0]);
      int b = Integer.parseInt(inputs[1]);
      int s = a * b;
      int r = a + a + b + b;
      System.out.printf("%d %d\n", s, r);
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
}
  