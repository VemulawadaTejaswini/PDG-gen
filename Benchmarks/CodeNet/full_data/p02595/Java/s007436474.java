import java.util.*;
public class Main{
  public static void main(String[] args){
    int n = Atcoder.getValue();
    int d = Atcoder.getValue();
    List<Zahyou> list = new ArrayList<Zahyou>();
    int count = 0;
    for(int i = 0; i < n; i++){
      list.add(new Zahyou(Atcoder.getValue(), Atcoder.getValue()));
    }
    for(Zahyou z: list){
      if(Atcoder.distanceOrigin((double)z.x, (double)z.y) < (double)d){
        count++;
      }
    }
    System.out.println(count);
  }
}
class Atcoder {
    public static int getValue(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        return n;
    }
    public static int[] getValues(int size){
        Scanner sc = new Scanner(System.in);
        int[] values = new int[size];
        for(int i = 0; i < size; i++){
            values[i] = sc.nextInt();
        }
        return values;
    }
    public static double distanceOrigin(double a, double b){
        return Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
    }
}
class Zahyou{
    int x;
    int y;
    Zahyou(int x,int y){
        this.x = x;
        this.y = y;
    }
}