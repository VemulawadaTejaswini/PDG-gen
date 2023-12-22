class Main
{
  public static void main(String[] args) {
    java.io.BufferedReader reader = null;
    try {
      reader = new java.io.BufferdReader(
         new InputStreamReader(System.in)
      );
      int rank1 = 0;
      int rank2 = 0;
      int rank3 = 0;
      for (int i = 0; i < 10; i++) {
         int x = Integer.parseInt(reader.readLine());
         if (x > rank1) {
           rank3 = rank2;
           rank2 = rank1;
           rank1 = x;
         } else if (x > rank2) {
           rank3 = rank2;
           rank2 = x;
         } else if (x > rank3) {
           rank3 = x;
         }
      }
      System.out.println(rank1);
      System.out.println(rank2);
      System.out.println(rank3);
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
}