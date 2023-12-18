import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      	int days = sc.nextInt();
      	int[][] input = new int[days][3];
      	for(int i=0; i< days; i++){
          input[i][0] = sc.nextInt();
          input[i][1] = sc.nextInt();
          input[i][2] = sc.nextInt(); 
        }
      	for(int j =1; j< days; j++){
        	input[j][0] += Math.min(input[j-1][1] , input[j-1][2]);
            input[j][1] += Math.min(input[j-1][0] , input[j-1][2]);
          	input[j][2] += Math.min(input[j-1][0] , input[j-1][1]);
        }
      	System.out.print(Math.min(Math.min(input[days-1][0], input[days-1][1]),input[days-1][2]));
      	scanner.close();
    }
}
