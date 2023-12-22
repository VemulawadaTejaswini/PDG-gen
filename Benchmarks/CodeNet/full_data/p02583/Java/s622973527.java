import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] l = new int[n];
      	int[] tri = new int[3];
      	int count = 0;
      
      	for(int i = 0; i < n; i++){
        	l[i] = sc.nextInt();
        }
      	
      	for(int i = 0; i < n-2; i++){
        	for(int j = i+1; j < n-1; j++){
            	for(int k = j+1; k < n; k++){
                  	if(l[i]!=l[k] && l[i]!=l[j] && l[j]!=l[k]){
                      tri[0]=l[i];
                      tri[1]=l[j];
                      tri[2]=l[k];
                      Arrays.sort(tri);
                      if(tri[2] < tri[1]+tri[0]){
                      	count++;
                      }
                    }
                }
            }
        }
      	System.out.print(count);
    }
}