import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long sum = 0;
    
    for(int i=1 ; i<=n ; i++){
      
      if( (i%3!=0)&&(i%5!=0)){
      if(i%3!=0) {
      	if(i%5!=0){
      		
      	sum+=i;
      	
      	
      	}
      }
    }
}
System.out.println(sum);
  }
}