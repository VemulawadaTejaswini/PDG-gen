import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long num = sc.nextLong();
      long mini = sc.nextLong();
      while(sc.hasNext()){
        long a = sc.nextLong();
        if(a < mini){mini = a;}
      }
      if(num%mini != 0){System.out.println(num/mini + 5);}
      else{System.out.println(num/mini + 4);}
    }
}