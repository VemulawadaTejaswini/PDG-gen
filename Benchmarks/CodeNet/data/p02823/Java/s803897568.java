import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int taku = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    if((A-B)%2 == 0){
      System.out.println((B-A)/2);
    }else if(A-1 < taku-B){
      System.out.println(B-1);
    }else{
      System.out.println(taku-A);
    }
  }
}