import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans =0;
    for (int i = a; i <= b; i++)
    {
      String as = Integer.toString(i);
      List<String> list=Arrays.asList(Integer.toString(i).split(""));
      Collections.reverse(list);
      String[] bs = (String[]) list.toArray(new String[list.size()]);
      String strb = String.join("", bs);
      if (as.equals(strb))
        ans++;
    }
    System.out.println(ans);
  }
}