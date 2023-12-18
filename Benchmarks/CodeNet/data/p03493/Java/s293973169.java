import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char s1 = sc.nextInt();
      	char s2 = sc.nextInt();
        char s3 = sc.nextInt();
      	String s = sc.next();
      	int counter == 0;
      	if(s1=='1'){
        	counter += 1;
        }
      	if(s2=='1'){
        	counter += 1;
        }
      	if(s3=='1'){
        	counter += 1;
        }
      	String s = 's1'+'s2'+'s3';
        long counter = s.chars().filter(ch -> ch == '1').count();
      	System.out.println(counter);
    }
}