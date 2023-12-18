
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		  
		  int N;
		  int M;
		  N = s.nextInt();
		  M = s.nextInt();
		  int code[][] = new int[M][4];
		  for(int i=0;i<M;i++) {
			  code[i][0]=i; 
			  code[i][1]=s.nextInt();
			  code[i][2]=s.nextInt();
			  code[i][3]=0;
		  }

Arrays.sort(code,0,M,new Comparator<int[]>() { 
public int compare(int[] k, int[] l) {
 if(k[1] < l[1]){
 return -1;
 } else if(k[1] > l[1]){ 
return 1;
 } else { 
	if(k[2] < l[2]) 		
return -1; 	
else if(k[2] > l[2]) 	
	return 1; 
	else 
		return 0; 
}
 } 
		}); 	

	
int temp=0,order=0;
  		for(int i=0;i<M;i++) { 
			int p= code[i][1]; 
    if(temp!=p) { 		
		temp=p; 
		order=1; 	
		} else {
			order++; 	
		} 			
code[i][3]=order; 	
	} 		


Arrays.sort(code,0,M,new Comparator<int[]>() { 
public int compare(int[] k, int[] l) {
 if(k[0] < l[0]){
 return -1;
 } else if(k[0] > l[0]){ 
return 1;
 }else {
		return 0; 
}
 } 
}); 		

		  
		  double resurt;
		  double tt;
	
			NumberFormat nf = NumberFormat.getInstance();
			nf.setGroupingUsed(false);
			nf.setMaximumIntegerDigits(12);	
			nf.setMinimumIntegerDigits(12);
				
		  for(int p=0;p<M;p++) {
			 
			  tt=(int)code[p][1];
			  
			  resurt = tt*1000000 + (int)code[p][3];
			
			  System.out.println(nf.format(resurt));
		  }
		
			  s.close();
		  
	}
}