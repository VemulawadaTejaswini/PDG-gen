public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b;
    String c;

    for(;;){
      a = sc.nextInt();
      c = sc.next();
      b = sc.nextInt();

      switch(c){
        case "+":
          System.out.println(a + b);
          break;
        case "-":
          System.out.println(a - b);
          break;
        case "*":
          System.out.println(a * b);
          break;
        case "/":
          System.out.println(a / b);
          break;
        case "?":
          a = -1;
          break;
        default:
          break;
      }
      if(a == -1)break;
    }
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}