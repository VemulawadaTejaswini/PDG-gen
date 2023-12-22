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
      long  a[] = new long[atai.length] ;
       while(i < atai.length){
        a[i] = Long.parseLong(atai[i]);
        System.out.println(a[i]);
        i++;
       }
    //  System.out.println(K+S);
        cal(a);
        scan.close();
    }
  
  public static void cal(long[] num){
    long s = 0;
    int j = 1;
    long t = 10;
    s = num[0];
    while(j < num.length){
      s = s*num[j];
      j++;
    }   
    for(int i = 1 ; i < 18 ; i ++){

    t = t*10;
  
    }
    if(s > t){
      System.out.println("-1");
    }else{
      System.out.println(s);
      System.out.println(t);
    }
  }
}