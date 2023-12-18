import java.util.*;
 
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int t= sc.nextInt();
      int[][] arr = new int[t][3];
      for(int i =0;i<t;i++){
      	for(int j =0;j<3;j++){
        	arr[i][j]= sc.nextInt();
        }
      }
      
      int[][] result = new int[t][3];
      result[0][0]= arr[0][0];
      result[0][1] = arr[0][1];
      result[0][2]= arr[0][2];
      
      for(int i =1;i<t;i++){
        	result[i][0]= Math.min(result[i-1][1],result[i-1][2])+arr[i][0]; 
            result[i][1]= Math.min(result[i-1][0],result[i-1][2])+arr[i][1];
            result[i][2]= Math.min(result[i-1][1],result[i-1][0])+arr[i][2];
      }

      System.out.println(Math.max(result[t-1][0],Math.max(result[t-1][1],result[t-1][2]));
    }
  
}
