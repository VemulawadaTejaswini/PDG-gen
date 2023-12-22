import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
 
 
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int q = scan.nextInt();

    Deque<deque> d = new ArrayDeque<deque>();

    for(int i = 0; i < n; ++i) {
        String name = scan.next();
        int time = scan.nextInt();
        d.add(new deque(name, time));
    }
     
    int elapsed = 0;
    while(!d.isEmpty()){
         deque p = d.removeFirst();
         if(p.time > q) {
            elapsed += q;
            d.add(new deque(p.name, p.time - q));
         }else{
            elapsed += p.time;
            System.out.println(p.name + " "  + elapsed);
         }
    }
  }
}
 
class deque {
    public String name;
    public int time;
    public deque(String n, int t) {
        name = n;
        time = t;
    }
 }