class Main{
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int age = sc.nextInt();
    if(age == 3 || age == 5 || age ==7){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}