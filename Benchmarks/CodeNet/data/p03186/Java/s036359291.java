public class A{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a + b >= c){
      System.out.println(b + c);
    }else{
      System.out.println(a + b + 1 + b);
    }
  }
}