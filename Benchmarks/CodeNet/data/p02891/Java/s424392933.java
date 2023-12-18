import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
  
  	static int check = 1;
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
        }else{
          if(n == 1){
            System.out.println(0);
          }else{
             String l = line;
             for(int i = 0; i < n-1; i++) l += line;
             count = count(l);
             c = count2(l);
             System.out.println(count+c);
          }
        }
    }
  
  	static long count(String line){
    	long count = 0;
      	int i = 0;
    	while(i < line.length()-1){
    		if(line.charAt(i) == line.charAt(i+1)){
              count++;
              i += 2;
              check = i;
            }else{
              i++;
            }
    	}
    	return count;
    }
  
  	static long count2(String line){
    	return (line.length() > 2 && 
                (check == line.length()-1) &&
                line.charAt(0) == line.charAt(line.length()-1)) ? 1: 0;
    }
}