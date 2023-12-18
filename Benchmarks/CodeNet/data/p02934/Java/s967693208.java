import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer>a = new ArrayList<Integer>();
    int aa;
    for(int i=0;i<n;i++){
      aa = sc.nextInt();
      a.add(aa);
    }
    double gyaku = 0;
    for(int i=0;i<n;i++){
      gyaku += 1.0/a.get(i);
    }
    System.out.println(1.0/gyaku);
  }
}
