import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    
    int X = scan.nextInt();
    int a;
    int b;
    boolean sign = true;
    
    if(X < 0){
      sign = false;
      X = -X;
    }
    
    double min = -100;
    double mid = 0;
    double max = 100;
    while(true){
      if(max == mid || min == mid){
	    if(Math.pow(mid, 5) < X){
			a = (int)-mid;
		}else{
			a = (int)mid;
		}
        break;
      }
  	  mid = Math.ceil((min + max) / 2);
      if((int)Math.pow(mid, 5) > X){
        max = mid - 1;
      }else if((int)Math.pow(mid, 5) < X){
        min = mid + 1;
      }else{
	  	  max = mid;
		  min = mid;
	  }
    }
    
    X -= (int)Math.pow(a, 5);
	 System.out.println("ccc" + X);
    min = - Math.abs(a) -1;
    mid = 0;
    max = Math.abs(a) +1;
	boolean flag = true;
    while(true){
      if(max == mid || min == mid){
        b = (int)-mid;
        break;
      }
  	  mid = Math.ceil((min + max) / 2);
      if((int)Math.pow(mid, 5) > X){
        max = mid - 1;
      }else if((int)Math.pow(mid, 5) < X){
        min = mid + 1;
      }else{
	  	  max = mid;
		  min = mid;
	  }
    }


    if(sign == false){
		a = -a;
		b = -b;
	}
    System.out.print(a + " " + b);
   }
}