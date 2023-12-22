import java.util.*;
class Main{
  public static void main(String[] a){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int x = 1001;
    int y = 1001;
    int z = 1001;
    for(;n>0;n--){
      int d = s.nextInt();
      if(d<x){
        z=y;
        y=x;
        x=d;
        continue;
      }
      if(d<y){
        z=y;
        y=d;
        continue;
      }
      if(d<z){
        z=d;
      }
    }
    if(y==1001){
        System.out.println(x);
    }else if(z==1001){
        System.out.println(x+y);
    }else{
        System.out.println(x+y+z);
    }
  }
}