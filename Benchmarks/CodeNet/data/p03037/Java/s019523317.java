import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int[] cards = new int[n];      
      
        for(int i=0; i<n; i++){
            cards[i] = 0;
        }
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i=a-1; i<b; i++){
                cards[i] = cards[i] + 1; 
            }
        }
        for(int i=0; i<n; i++){
          int a = cards[i];
          //System.out.println(a);
            if(a==m){
              count++;
            }
        }       
      	System.out.println(count);
	}
}