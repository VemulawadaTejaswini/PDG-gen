public class Main{
  static int head, tail;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, q;
    String[] name;
    int[] time;
    int i, t, a;
    String s;

    n = sc.nextInt();
    q = sc.nextInt();
    name = new String[n + 1];
    time = new int[n + 1];
    for(i = 0;i < n;i++){
      name[i] = sc.next();
      time[i] = sc.nextInt();
    }
    head = 0;
    tail = n;
    t = 0;

    for(;!isEmpty();){
      a = dequeue(time, n);
      s = strdequeue(name, n);
      if(a > q){
        t += q;
        a -= q;
        strenqueue(name, n, s);
        enqueue(time, n, a);
      }else{
        t += a;
        System.out.println(s + " " + t);
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static void enqueue(int[] time, int n, int a){
    time[tail] = a;
    tail = (tail + 1) % (n + 1);
  }

  private static void strenqueue(String[] name, int n, String s){
    name[tail] = s;
  }

  private static int dequeue(int[] time, int n){
    head = (head + 1) % (n + 1);
    return time[(n + head) % (n + 1)];
  }

  private static String strdequeue(String[] name, int n){
    return name[(head + n) % (n + 1)];
  }

  private static boolean isEmpty(){
    if(head == tail){
      return true;
    }else{
      return false;
    }
  }

}