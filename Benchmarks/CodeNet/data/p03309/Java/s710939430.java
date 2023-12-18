import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int[n];
    int b=0;
    long answer =0; 
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt()-(i+1);
    }
    Arrays.sort(x);
    if(n%2==0){
      b=(x[n/2]+x[(n/2)-1])/2;//中央値
    }else{
      b=x[(n-1)/2];//中央値
    }
    for(int i=0;i<n;i++){
      answer =answer +Math.abs(x[i]-b);
    }
    System.out.println(answer);
    
      
  }
  

  
}