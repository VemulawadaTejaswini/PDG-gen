import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int q = sc.nextInt();
      	int player[] = new int[n];
      	for(int i = 0; i < n; i++)
          player[i] = k;
     
        int answer;
        for(int i = 0; i < q; i++){
          answer = sc.nextInt();
          for(int j = 0; j < n; j++){
            if(j != answer - 1){
              player[j]--;
            }
          }
        }
      	
      	for(int i = 0; i < n; i++){
          if(player[i] <= 0)
            System.out.println("No");
      	  else
            System.out.println("Yes");
        }
      
         
      }
      
		
}