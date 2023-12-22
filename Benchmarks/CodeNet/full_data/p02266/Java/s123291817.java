import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String csd = br.readLine();
      int total= 0;
      int[] area;
      IntStack stack1 = new IntStack(csd.length());
      Deque<int[]> stack2 = new ArrayDeque<>();

      for(int i=0,max=csd.length(); i<max; i++) {
        if(csd.charAt(i) == '\\') stack1.push(i);
        else if(csd.charAt(i) == '/' && !stack1.isEmpty()) {
          int s = stack1.pop();
          area = new int[]{s,i-s};
          total += area[1];
          while( (stack2.size())>0 && (stack2.peek()[0] > s)) {
            area[1] += stack2.pop()[1];
          }
          stack2.push(area);
        }
      }
      
      StringBuilder buf = new StringBuilder();
      buf.append(total).append('\n')
         .append(stack2.size());
      while(stack2.size() > 0) {
        buf.append(' ')
           .append(stack2.pollLast()[1]);
      }
      System.out.println(buf);
    }
    catch(IOException e) {
      System.err.println("IOException!");
    }
  }
}

class IntStack {
  int[] stack;
  int ite;

  public IntStack(int capacity) {
    stack = new int[capacity];
    ite = 0;
  }

  public void initialize() {
    ite = 0;
  }

  public int getIte() {
    return ite;
  }

  public boolean isEmpty() {
    return ite == 0;
  }

  public boolean isFull() {
    return ite >= stack.length-1;
  }

  public  boolean push(int x) {
    if(isFull()) return false;

    stack[++ite] = x;
    return true;
  }

  public int pop() {
    if(isEmpty()) return 0;

    return stack[ite--];

  }
}
