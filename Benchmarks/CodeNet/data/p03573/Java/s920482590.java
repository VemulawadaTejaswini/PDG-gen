import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int[] input = new int[3];
      	for(int i = 0; i < 3; i++){
          	input[i] = sc.nextInt();
        }
      
      	if(candidate == input[1])
          	System.out.println(input[2]);
      	else if(candidate == input[2])
          	System.out.println(input[1]);
      	else
          	System.out.println(input[0]);
    }
}