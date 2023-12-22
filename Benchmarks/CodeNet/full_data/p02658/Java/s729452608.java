import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
  final static int max = 100;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      int N;
      int i = 0;
      String A_n;     

       while (scan.hasNextLine()) {
      String an = scan.nextLine();
      list.add(an);
      }
      N = Integer.parseInt(list.get(0));
      A_n = list.get(1);
      String atai[] = A_n.split(" ",0);
      int  a[] = new int[atai.length] ;
       while(i < atai.length){
        a[i] = Integer.parseInt(atai[i]);
        System.out.println(a[i]);
        i++;
       }
    //  System.out.println(K+S);
        cal(a);
        scan.close();
    }
  
  public static void cal(int[] num){
    long s = 0;
    int j = 1;
    s = num[0];
    while(j < num.length){
      s = s*num[j];
      j++;
    }   
    if(s > Math.pow(10,18)){
      System.out.println("-1");
    }else{
      System.out.println(s);
    }
  }
}