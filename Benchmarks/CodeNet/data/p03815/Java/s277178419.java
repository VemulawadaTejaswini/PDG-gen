import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long count = n/11*2;
      if(n%11>6){
        count += 2;
      }else{
        count++;
      }   
      System.out.println(count);
	}
}