import java.util.Scanner;

public class Main{
	public static void main(String[]args){
    	Scanner sc=new Scanner(System.in);
      	int N=sc.nextInt();
      	int array[]=new int[N];
      	int big=0;
      	int small=0;
      	int total=0;
      
      	for(int t=0;t<N;t++){
        	array[t]=sc.nextInt();
        }
      
      	for(int k=0; k<N;k++){
          	for(int s=0;s<N;s++){
            	if(array[s]>=k){
                	big+=1;
                }else{
                	small+=1;
                }
              }
          if(big==small){
              	total+=1;
            }
        }
      System.out.println(total);
}
}