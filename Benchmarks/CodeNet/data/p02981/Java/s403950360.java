class Main {
  public static void main(String[] args) {
    if (args == null || args.length != 3) return null;
    
    int N = args[0];
    int A = args[1];
    int B = args[2];
    
    int result = N * A > B ? N : N * A;
    
    System.out.println(result);
    
  }
}