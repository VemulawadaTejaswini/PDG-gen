import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    long time = sc.nextLong();
    long booka[] = new long[a];
    long bookb[] = new long[b];
    for(int i = 0;i < a;i++){
      long da = sc.nextLong();
      if(i == 0){
        booka[i] = da;
      }
      else{
        booka[i] = booka[i - 1] + da;
      }
    }
    for(int i = 0;i < b;i++){
      long db = sc.nextLong();
      if(i == 0){
        bookb[i] = db;
      }
      else{
        bookb[i] = bookb[i - 1] + db;
      }
    }
    int judge = 0;
    long max = 0;
    for(int i = 0;i < b;i++){
      if(booka[0] + bookb[i] <= time){
        judge = i;
        max = i + 2;
      }
      else{
        break;
      }
    }
    for(int i = 0;i < a;i++){
      for(int j = judge;j >= 0;j--){
        if(booka[i] + bookb[j] <= time){
          int temp = i + j + 2;
          judge = j;
          if(temp > max){
            max = temp;
          }
          break;
        }
      }
    }
    System.out.println(max);
  }
}
    