
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int q = cin.nextInt();

    long item = 0;
    PriorityQueue<Long> rec = new PriorityQueue<>();
    for (int i = 0; i < q; i++) {
      int num = cin.nextInt();
      if (num == 1) {
        rec.add(cin.nextLong());
        item += cin.nextLong();
        //System.out.println("item " + item);
        //System.out.println("len " + rec.size());
      } else if (num == 2) {
        PriorityQueue<Long> temp = new PriorityQueue<>(rec);
        long res = item;
        int len = rec.size();
        long recX = 0;
        if (len % 2 == 0) {
          for (int j = 0; j < len / 2; j++) {
            res -= temp.poll();
          }
          recX = rec.peek();
          for (int j = 0; j < len / 2; j++) {
            res += temp.poll();
          }
          System.out.println(recX + " " + res);
        } else if (len % 2 == 1) {
          for (int j = 0; j < len / 2; j++) {
            res -= temp.poll();
          }
          recX = temp.poll();
          for (int j = 0; j < len / 2; j++) {
            res += temp.poll();
          }
          rec = temp;
          System.out.println(recX + " " + res);
        }
      }
    }

  }

}