import java.io.*;
import java.util.*;

class Sequencing{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	int n = Integer.parseInt(s.nextLine());
      	String str="";
      	for(int i=0;i<n;i++){
        	str+=s.nextLine();
        }
      	char arr[] = str.toCharArray();
      
      	int x=0;
      	for(int i=0;i<arr.length;i++){
        	if(arr[i]=='('){
        	    	x++;
            	}else if(x==0&&arr[i]==')'){
			x++;
			break;		
		}
		else{
            		x--;
            	}
        }
      	
      	if(x==0){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}