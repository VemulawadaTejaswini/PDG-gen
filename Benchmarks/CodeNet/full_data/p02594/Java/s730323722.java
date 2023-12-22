import java.util.*;
public class Main{
  public static void main(String[] args){
    if(Atcoder.getValue() >= 30)
      System.out.println("yes");
    else
      System.out.print("no");
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
}