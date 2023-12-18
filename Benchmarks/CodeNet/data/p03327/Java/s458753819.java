class Main {
  static public void main(String args[]) {
    if(Integer.parseInt(args[0]) < 1000){
      System.out.println("ABC" + dformat.format(n));
    } else {
      System.out.println("ABD" + dformat.format(n-1000));
    }
      return 0;
    }
}