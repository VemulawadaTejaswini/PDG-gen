import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    while (n > 0) {
      list.add((n-1)%26+1);
      n /= 26;
    }
    int size = list.size();
    int codea = (int)'a';
    char[] list2 = new char[size];
    for (int i = 0; i < list.size(); i++) {
      list2[i] = (char)(codea+list.get(size-i-1)-1);
    }
    System.out.println(String.valueOf(list2));
    sc.close();
  }
}