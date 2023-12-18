import java.util.*;
import java.util.stream.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] cities_andX = new int[N+1];
    for(int i=0;i<N+1;i++){
      cities_andX[i] = scan.nextInt();
    }
    scan.close();
    
    Arrays.sort(cities_andX);
    
    int[] distances = new int[N];
    for(int i=0;i<N;i++){
      distances[i] = Math.abs(cities_andX[i]-cities_andX[i+1]);
    }
    
    int result = Arrays.stream(distances).distinct().sorted().reduce((a,b)->{
      int tmp;
      while((tmp=b%a)!=0){b=a;a=tmp;}
      return a;
    }).getAsInt();
    System.out.println(result);
      
  }//main
}//Main