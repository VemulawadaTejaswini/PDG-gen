import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
      	Long sum = 0L;
		for(int i = 0; i < num; i++){
          if(i % 3 == 0){
            }else if(i % 5 == 0){
          }else if(i % 15 == 0){
          }else{
            sum = sum + i;
          }
        }
      System.out.println(sum);
        }
	}
