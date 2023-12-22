class Main {
  public static void main(String args[]) {

    Integer s = Integer.parseInt(args[0]);
    Integer w = Integer.parseInt(args[1]);
    if (s <= w) {
      System.out.println("unsafe");
    } else {
      System.out.println("safe");
    }

  }
}