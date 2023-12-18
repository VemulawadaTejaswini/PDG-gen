import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int a = sc.nextInt();
    
    int t = 0; //500円玉の個数
    
    
    for(int i=0 ; i<=40 ; i++){
      
      int total = n - 500*i;
      if(total<0){
      	t = i-1;
      	break;
      }else if(total==0){
      	System.out.println("Yes");
      	return;
      }
      }
     
      
      if( (n-500*t)<=a){
      	System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
     }
    }