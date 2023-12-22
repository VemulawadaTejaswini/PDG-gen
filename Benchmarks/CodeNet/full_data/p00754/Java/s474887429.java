public class Main{
  static int top;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    char[] ch;
    String str;
    int i;

    for(;;){
      str = sc.nextLine();
      if(".".equals(str))break;
      ch = new char[str.length()];
      top = 0;
      out.println(solve(ch, str));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static String solve(char[] ch, String str){
    char[] stack;
    int i;

    stack = new char[str.length()];
    for(i = 0;i < str.length();i++){
      ch[i] = str.charAt(i);
      if(ch[i] == '(')push(stack, ch[i]);
      else if(ch[i] == '[')push(stack, ch[i]);
      else if(ch[i] == ')'){
        if(top != 0 && seetop(stack) == '(')top--;
        else return("no");
      }else if(ch[i] == ']'){
        if(top != 0 && seetop(stack) == '[')top--;
        else return("no");
      }
    }
    if(top == 0)return "yes";
    else return "no";
  }
  private static char pop(char[] stack){
    return stack[--top];
  }
  private static void push(char[] stack, char a){
    stack[top++] = a;
    return;
  }
  private static char seetop(char[] stack){
    return stack[top - 1];
  }
}