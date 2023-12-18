import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	String line = sc.nextLine();
      	long n = sc.nextLong();
      
      	int i = 1;
    	long count = 0;
      	int check = 0;
    	while(i <= line.length()-1){
    		if(line.charAt(i-1) == line.charAt(i)){
              count++;
              check = i;
              i += 2;
            }else{
              i++;
            }
    	}
      
      	long c = (check != line.length()-1) && (line.charAt(0) == line.charAt(line.length()-1)) ? 1: 0;
      	System.out.println(count*n + c*(n-1));	
    }
}