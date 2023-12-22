public class Main{
  static int top = 0;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double[] stack;
    String prec;
    char c;

    stack = new double[200];
    top = 0;

    for(;sc.hasNext();){
      prec = sc.next();
      c = prec.charAt(0);
      if('0' <= c && c <= '9'){
        push(stack, (double)Integer.parseInt(prec));
      }else if(c == '+'){
        push(stack, pop(stack) + pop(stack));
      }else if(c == '-'){
        push(stack,  -pop(stack) + pop(stack));
      }else if(c == '*'){
        push(stack, pop(stack) * pop(stack));
      }else if(c == '/'){
        push(stack, 1.0 / pop(stack) * pop(stack));
      }else{
        break;
      }
    }

    System.out.println(pop(stack));

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static double pop(double[] stack){
    return stack[--top];
  }

  private static void push(double[] stack, double a){
    stack[top++] = a;
    return;
  }
}