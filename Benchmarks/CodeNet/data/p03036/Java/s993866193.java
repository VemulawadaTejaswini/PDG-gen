class Main {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int d = Integer.parseInt(args[1]);
    long tmp = (long)Integer.parseInt(args[2]);
    
    for(int i = 0; i < 10; i++) {
      tmp = r * tmp - d;
      System.out.println(tmp);
    }     
  }
}