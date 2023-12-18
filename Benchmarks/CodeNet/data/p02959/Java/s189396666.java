import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] enemy = new int[n+1];
        int[] brave = new int[n];
        int sum = 0;
        for(int i=0; i<=n; i++){
          enemy[i] = sc.nextInt(); 
        }
        for(int i=0; i<=n-1; i++){
          brave[i] = sc.nextInt(); 
        }
      for(int i=0; i<=n-1; i++){
        if(enemy[i] >= brave[i]){
            sum += brave[i];
        }
        else if(enemy[i]+enemy[i+1] >= brave[i]){
            sum += brave[i];
            enemy[i+1] -= brave[i]-enemy[i];
        }
        else{
            sum += enemy[i]+enemy[i+1];
            enemy[i+1] = 0;
        }
       }
	  System.out.println(sum);
	}
}