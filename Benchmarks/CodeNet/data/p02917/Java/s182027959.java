import java.util.*;
 
public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int[] b = new int[number-1];
    int sum = 0;
      
    for(int i = 0; i < number-1; i++){
    	b[i] = sc.nextInt();
    }
    sum += b[0];
    for(int j = 0; j < number-2; j++){
       if(b[j] >= b[j+1]){
       	sum += b[j+1];
       }else{
       	sum += b[j];
       }
    }
      
    sum += b[number-2];
    System.out.println(sum);
    }
}