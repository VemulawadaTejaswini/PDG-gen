import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	String line = sc.nextLine();
      	long n = sc.nextLong();
      
      	
     	long count;
      	long c = 0l;
      	if(line.length() > 1){
          count = count(line);
          c = count2(line);
      	  System.out.println(count*n + c*(n-1));
          System.out.println(count*n + c*(n-1));
        }else{
          if(n == 1)
            System.out.println(0);
            else{
             String l = line;
             for(int i = 0; i < n-1; i++) l += line;
              count = count(l);
              c = count2(l);
              System.out.println(count+c);
            }
        }
      	  
    }
  
  	static long count(String line){
      	int i = 1;
    	long count = 0;
    	while(i <= line.length()-1){
    		if(line.charAt(i-1) == line.charAt(i)){
              count++;
              i += 2;
            }else{
              i++;
            }
    	}
    	return count;
    }
  
  	static long count2(String line){
    	return (line.charAt(line.length()-2) != line.charAt(line.length()-1)) && (line.charAt(0) == line.charAt(line.length()-1)) ? 1: 0;
    }
}