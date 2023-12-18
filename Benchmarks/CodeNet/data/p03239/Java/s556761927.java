import java.util.Scanner;

import java.util.TreeMap;


public class Main{
  public  static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int t = sc.nextInt();
    int a ;
    int b ;
    TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
    for(int i=0; i<n; i++){
     a = sc.nextInt();
     b = sc.nextInt();
     if(b<=t){
       map.put(a,b);
     }
    }
    if(map.size()==0){
      System.out.println("TLE");
    }else{
      System.out.println(map.firstKey());
    }

  }
}
