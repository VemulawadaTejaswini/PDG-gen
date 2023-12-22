public class Main{
  static int top1 = 0;
  static int top2 = 0;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] stack1, stack2;
    int n, i, j, x, y;
    int[] a;

    n = sc.nextInt();
    stack1 = new int[10];
    stack2 = new int[10];
    a = new int[10];

    for(i = 0;i < n;i++){
      top1 = 0; top2 = 0;
      for(j = 0;j < 10;j++)a[j] = sc.nextInt();
      for(j = 0;j < 10;j++){
        x = seetop1(stack1); y = seetop2(stack2);
        if(x <= y && a[j] > y)push2(stack2, a[j]);
        else if(y < x && a[j] > x)push1(stack1, a[j]);
        else if(x <= y && a[j] > x)push1(stack1, a[j]);
        else if(y < x && a[j] > y)push2(stack2, a[j]);
        else break;
      }
      if(j < 10)out.println("NO");
      else out.println("YES");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void push1(int[] stack, int a){
    stack[top1++] = a;
    return;
  }
  private static int seetop1(int[] stack){
    if(top1 == 0)return 0;
    else return stack[top1 - 1];
  }
  private static void push2(int[] stack, int a){
    stack[top2++] = a;
    return;
  }
  private static int seetop2(int[] stack){
    if(top2 == 0)return 0;
    else return stack[top2 - 1];
  }
}