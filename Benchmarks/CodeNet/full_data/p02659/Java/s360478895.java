import java.util.*;
  public class Main {
    public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        //int A = sc.nextInt();
        long A = sc.nextLong();
        //実数から小数点以下の値だけを取り出す
        long B = (long)(sc.nextDouble()*100.0+0.5);
        System.out.println((A*B)/100);
        
    }
  }