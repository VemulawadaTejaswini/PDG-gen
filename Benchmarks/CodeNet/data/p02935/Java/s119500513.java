import java.util.*;
import java.io.*;
class Main {
 public static void main(String[] args) {
   Scanner file = new Scanner(System.in);
   int n = file.nextInt();
   ArrayList<Double> a = new ArrayList<>();
   for (int i = 0; i < n; i++) a.add(file.nextDouble());
   Collections.sort(a);
   while (a.size() > 1) {
    ArrayList<Double> b = new ArrayList<>();
    for (int i = 0; i < a.size() - 1;) {
     b.add((a.remove(i) + a.remove(i + 1)) / 2.0); 
    }
    if (!a.isEmpty()) b.add(a.get(0));
    Collections.sort(b);
    a = (ArrayList<Double>) b.clone();
   }
   System.out.println(a.get(0));
 }
}