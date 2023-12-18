import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.io.InputStream;


public class Main {

  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int taskCount = sc.nextInt();
    ArrayList<Task> tasks = new ArrayList<>();
    while (sc.hasNext()) {
      tasks.add(new Task(sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(tasks, new TaskComparator());
    int totalTime = 0;
    for (Task task : tasks) {
      totalTime += task.getRequiredTime();
      if (totalTime > task.getDeadline()) {
        System.out.println("no");
        return;
      }
    }
    System.out.println("yes");
  }

}

class Task {
  public Task(int requiredTime, int deadline) {
    this.requiredTime = requiredTime;
    this.deadline = deadline;
  }
  private int requiredTime;
  private int deadline;
  public int getRequiredTime() {
    return requiredTime;
  }
  public int getDeadline() {
    return deadline;
  }
}

class FastScanner {
  private final InputStream in = System.in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;
  private boolean hasNextByte() {
      if (ptr < buflen) {
          return true;
      }else{
          ptr = 0;
          try {
              buflen = in.read(buffer);
          } catch (IOException e) {
              e.printStackTrace();
          }
          if (buflen <= 0) {
              return false;
          }
      }
      return true;
  }
  private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
  private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
  public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
  public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)) {
          sb.appendCodePoint(b);
          b = readByte();
      }
      return sb.toString();
  }
  public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
          minus = true;
          b = readByte();
      }
      if (b < '0' || '9' < b) {
          throw new NumberFormatException();
      }
      while(true){
          if ('0' <= b && b <= '9') {
              n *= 10;
              n += b - '0';
          }else if(b == -1 || !isPrintableChar(b)){
              return minus ? -n : n;
          }else{
              throw new NumberFormatException();
          }
          b = readByte();
      }
  }
  public int nextInt() {
      long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
      return (int) nl;
  }
  public double nextDouble() { return Double.parseDouble(next());}
}

class TaskComparator implements Comparator<Task> {

  @Override
  public int compare(Task t1, Task t2) {
    return t1.getDeadline() < t2.getDeadline() ? -1: 1;
  }

}