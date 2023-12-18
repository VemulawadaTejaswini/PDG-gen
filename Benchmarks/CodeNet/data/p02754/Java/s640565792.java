import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       List<Integer> list = new ArrayList<>();
      for(int i = 0; i < 3; i++){
		Integer num = sc.nextInt();
        list.add(num);
      }
      int N = list.get(0);
      int A = list.get(1);
      int B = list.get(2);
      int C = 0;
      
      if(A == 0){
        System.out.println("0");
      }else if(N <= A + B){
         System.out.println(A);
      }else{
        while(N >= A+B){
          C++;
          N = N-(A+B);
        }
        System.out.println(C*A + N);
      }
    }
}