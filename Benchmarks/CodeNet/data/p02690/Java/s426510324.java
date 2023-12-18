import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      long x = sc.nextLong();
      for(int i=0; true; i++){
        int b5 = i;
        long b = (int)(Math.pow(b5, 5));
        long a = x+b;
        double a5 = Math.cbrt(Math.sqrt(a));
        if((a5-(int)a5==0) && (Math.pow(a5, 5)-b==x)){
		  System.out.println((int)a5+" "+b5);
          break;
        }
        b = -b;
        a = x+b;
        a5 = Math.cbrt(Math.sqrt(a));
        if((a5-(int)a5==0) && (Math.pow(a5, 5)-b==x)){
		  System.out.println((int)a5+" "+-b5);
          break;
        }
      }
    }
}