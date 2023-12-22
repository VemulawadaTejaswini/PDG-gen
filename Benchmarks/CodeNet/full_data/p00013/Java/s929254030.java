public class Main{
  static int top = 0;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] stack;

    stack = new int[20];
    for(;sc.hasNext();){
      n = sc.nextInt();
      if(n != 0){
        push(stack, n);
      }else{
        System.out.println(pop(stack));
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int pop(int[] stack){
    return stack[--top];
  }

  private static void push(int[] stack, int a){
    stack[top++] = a;
    return;
  }

}