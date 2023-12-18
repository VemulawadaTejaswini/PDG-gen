import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long X = sc.nextLong();
	long i = 100;
    int years = 0;
	while(i < X){
      i += i / 100L;
      years++;
    }
      System.out.println(years);
	}
}