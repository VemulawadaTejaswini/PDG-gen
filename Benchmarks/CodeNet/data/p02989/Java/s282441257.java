import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
          int N =sc.nextInt();
          int n[] = new int[N];
      
      for(int i=0; i<N; i++){
      n[i]= sc.nextInt();
      }
      
      Arrays.sort(n);
      
      for(int i=0; i<N; i++){
      System.out.println(n[N/2]-n[N/2-1]);
        break;
    }
}
}