import java.util.*;
class Main
{
  public static void main(System.in);
  
  int k = sc.nextInt();
  int s = sc.nextInt();
  
  int sum = 0;
  
  for(int x=0 ; x<=k ; x++){
    for(int y=0 ; y<=k ; y++){
     int x = s-(x+y);
      if( (x<=k)&&(x>=0)){
        sum++;
      }
    }
  }
}

        