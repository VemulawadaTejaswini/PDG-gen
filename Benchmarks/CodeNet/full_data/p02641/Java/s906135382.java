import java.util.*;

class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
    //int 整数
    int x = sc.nextInt();
    //長さ
    int n = sc.nextInt();
    if(n == 0){
      System.out.println(x);
      return;
     }
    
    int dif_min = 0;
    int c = 0;
    for(int i = 0; i < n;i++){
      int p = sc.nextInt();
      int dif = Math.abs(x - p);
      if(dif == 0){
        	dif_min++;
        }
      
      if(dif > 0){
        if(dif_min == dif){
          dif_min++;
        }else if(dif_min < dif){c++;}
      }
      
    }
    if(c == 0){
     System.out.println(Math.min(x + dif_min,x - dif_min));
    }else{System.out.println(Math.max(x + dif_min,x - dif_min));}
  }
}