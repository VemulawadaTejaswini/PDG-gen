import java.io.*; 
import java.util.Scanner;
import java.lang.Math;

public class Main {
  
	public static void main(String[] args){
      	
      	Scanner in = new Scanner(System.in);
		int N = in.nextInt();
      	int M = in.nextInt();
      
      	int[] rotos = new int[M];
      	for(int i=0;i<M;i++){
        	rotos[i]= in.nextInt();
        }
        
      	if(N==0) System.out.println(0);
      	else System.out.println(ways(rotos, N));
      	
	}
  	
  	public static int ways(int[] rotos, int steeps){
    	return waysAux(rotos, steeps, 0, 1);
    }
  
  	public static int waysAux(int[] rotos, int steeps, int counter, int pos){
      	if(posRota(pos, rotos)) return 0;
      	else{
        	if(pos>=steeps) return 1;
          	else{
            	counter+= waysAux(rotos,steeps,counter,pos+1);
            	counter+= waysAux(rotos,steeps,counter,pos+2);
            }
        }
      	return counter;
     
    }
  
    public static boolean posRota(int pos, int[]rotos){
      	for(int i=0; i< rotos.length; i++){
        	if (pos == rotos[i]) return true;
          	else return false;
        }
      	return false;
    }
  
}