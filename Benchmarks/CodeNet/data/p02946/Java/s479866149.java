import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int N1 = sc.nextInt();
      int N2 = sc.nextInt();      
		for(int i = -N1 +1;  i <  N1  ; i++){
          	if( N2 + i < -1000001 || N2 + i > 1000001){
            continue;
            }
			System.out.println(N2 + i);
          }
    }
}
