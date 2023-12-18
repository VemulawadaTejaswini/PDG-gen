import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long taku = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    if((B-A)%2 == 0){
      System.out.println((B-A)/2);
    }else if(taku-A > B-1){
      System.out.println((taku-B)+((taku-A)-(taku-B))/2);
    }else{
      System.out.println((A-1)+((B-1)-(A-1))/2);
    }
  }
}