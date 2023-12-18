import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] member = new int[N];
    for(int i = 0 ; i < N - 1 ; i++){
      member[sc.nextInt()]++; 
    }
      for(int j = 0 ; j < N ; j++){
        System.out.println(member[j]);
      }
        
	
	}
}