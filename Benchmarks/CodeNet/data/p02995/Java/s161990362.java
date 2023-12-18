import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class Main {
 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
long A = sc.nextLong();
long B = sc.nextLong();
long C = sc.nextLong();
long D = sc.nextLong();
sc.close();
 
long ans = 0;
List<Long> cList = new ArrayList<>();
long t = 0;
if (A % C == 0) {
  t = A;
} else {
  t = A + (C - (A % C));
}
while (t <= B) {
  cList.add(t);
  t += C;
}
List<Long> dList = new ArrayList<>();
if (A % D == 0) {
  t = A;
} else {
  t = A + (D - (A % D));
}
  while (t <= B) {
  if (!cList.contains(t)) {
  dList.add(t);
  }
  t += D;
}

System.out.println(B - A - cList.size() - dList.size());
}
}