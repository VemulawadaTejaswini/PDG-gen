import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int y = sc.nextInt();
    
    for(int i=0 ; i<2000 ; i++){
      for(int j=0 ; j<4000 ; j++){
        for(int k=0 ; k<20000 ; k++){
          
          int total = 10000*i + 5000*j + 1000*k;
          if(y==total){
            System.out.print(i+" "+j+" "+k);
            return;
          }
        }
      }
    }
  }
}       