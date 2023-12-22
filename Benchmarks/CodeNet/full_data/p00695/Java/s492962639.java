import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
 
 
public class Main {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        final int m = sc.nextInt();
        
        for(int tt = 0; tt < m; tt++){
        	int[][] sum = new int[5][5];
        	
        	for(int i = 0; i < 5; i++){
        		for(int j = 0; j < 5; j++){
        			sum[i][j] = sc.nextInt();
        		}
        	}
        	/*
        	for(int i = 0; i < 5; i++){
        		for(int j = 1; j < 5; j++){
        			sum[i][j] += sum[i][j-1];
        		}
        	}
        	*/
        	for(int j = 0; j < 5; j++){
        		for(int i = 1; i < 5; i++){
        			if(sum[i][j] == 0){
        				continue;
        			}else if(sum[i-1][j] == 0){
        				continue;
        			}else{
        				sum[i][j] += sum[i-1][j];
        			}
        		}
        	}
        	
        	int max = Integer.MIN_VALUE;
        	Stack<Integer> stack = new Stack<Integer>();
        	Stack<Integer> number = new Stack<Integer>();
        	for(int i = 0; i < 5; i++){
        		stack.clear();
        		number.clear();
        		
        		for(int j = 0; j < 5; j++){
        			//System.out.println(stack);
        			//System.out.println(number);
        			
        			if(stack.isEmpty()){
        				stack.push(sum[i][j]);
        				number.push(j);
        			}else if(stack.peek() <= sum[i][j]){
        				stack.push(sum[i][j]);
        				number.push(j);
        			}else{
        				while(!stack.isEmpty() && stack.peek() > sum[i][j]){
        					final int high = stack.pop();
        					final int dist = j - number.pop();
        					
        					max = Math.max(max, high * dist);
        				}
        				
        				stack.push(sum[i][j]);
        				number.push(j);
        			}
        		}
        	}
        	
        	while(!stack.isEmpty()){
        		final int high = stack.pop();
        		final int dist = 5 - number.pop();
        					
        		max = Math.max(max, high * dist);
        	}
        	
        	System.out.println(max);
        }
         
         
    }
 
}