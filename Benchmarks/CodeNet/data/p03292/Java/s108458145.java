import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A_1 = sc.nextInt();
      int A_2 = sc.nextInt();
      int A_3 = sc.nextInt();
      int[] S = new int[]{A_1,A_2,A_3};
      Arrays.sort(S);
      
      System.out.println(S[2]-S[0]);
    }
}