import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    ArrayList <Integer> li = new ArrayList <Integer>();
    ArrayList <Integer> lili = new ArrayList <Integer>();
    for(int i=0; i<number-1; i++){
      int a = sc.nextInt();
      li.add(a);
    }
    for(int i=0;i<number;i++){
      lili.add(0);
    }
    for(int i=0; i<number-1; i++){
      for(int k=1; k<number+1; k++){
        if(li.get(i)==k){
          lili.set(k-1,lili.get(k-1)+1);
        }
      }
    }
    for(int i=0;i<number;i++){
      System.out.println(lili.get(i));
    }
  }
}