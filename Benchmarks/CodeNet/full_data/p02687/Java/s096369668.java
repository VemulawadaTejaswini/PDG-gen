  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] kind = new String[]{"ABC","ARC"};
    
    String s = sc.next();
    if (s.equals(kind[0])){
      System.out.println(kind[1]);
    } else {
      System.out.println(kind[0]);
    }
  }
