import java.util.*;

public class Main { 
	public static void main(String argsp[]) 
    {	
      	Scanner sc = new Scanner(System.in);
      	String input = sc.nextLine();
      	String[] inputs = input.split(" ");
      	int N = Integer.valueOf(inputs[0]);
      	int M = Integer.valueOf(inputs[1]);
      	int[] likedFood  = new int[M+1];
      	
      	for( int i = 0 ; i<N ; i++ )
        {
          	input  = sc.nextLine();
          	inputs = input.split(" ");
          	int foodLiked = Integer.valueOf(inputs[0]);
          	for(int j = 1 ;j<=foodLiked ; j++)
            {
               int value = Integer.valueOf(inputs[j]);
               likedFood[value]+=1;
            }
        }
      int ans = 0; 
      for( int i = 1 ; i<=M ; i++) {
      	if(likedFood[i]==N)
        {
          ans++;
        }
      }
      System.out.println(ans);
    }
}