class Main
{
  public static void main(String[] args) {
    Main m = new Main();
    System.out.println(m.cube(m.readInt(System.in)));
  }

  private Main() {
  }

  int readInt(InputStream is) {
    java.io.DataInputStream dis = new java.io.DataInputStream(is);
    return dis.readInt();
  }

  int cube(int n) {
    return n * n * n;
  }
}