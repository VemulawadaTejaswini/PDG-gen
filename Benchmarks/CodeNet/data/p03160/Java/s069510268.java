import java.util.*;
class Main{
    
    static int i=0;
    static long sum=0;
    static void solveDiscrepancy(int arr[],int point[],int next[],int n){
            
            
            
             if(i == n-3){
                sum+=arr[n-1];
                i=n-1;
            }
            else if( i == n-2){
                sum+=next[i+1];
                i=n-1;
            }
            
            else if( i == n-4){
                int choice_down=Math.min(next[i+2],point[n-1]);
                int choice_up=next[n-1];
                if(choice_up < choice_down) {
                    sum+=point[i+2];
                    i+=2;
                }
                else{
                    sum+=next[i+1];
                    i++;
                }
            }
            
            else if(i < n-4){
                
                int choice_down=Math.min(next[i+2],point[i+3]);
                int choice_up=Math.min(next[i+3],point[i+4]);
                if(choice_up < choice_down) {
                    sum+=point[i+2];
                    i+=2;
                }
                else if(choice_down == choice_up)
                {
                    solveDiscrepancy(arr,point,next,n);
                    sum+=next[i+1];
                }
                else{
                    sum+=next[i+1];
                    i++;
                }
            }
            
    }
	public static void main(String args[]){
    	
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int point[]=new int[n];
      int next[]=new int[n];
      
    
      for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
                   if(i == 0){
                     point[i]=0;next[i]=0;
                  }
                 else if(i == 1){
                      point[i]=Math.abs(arr[i]-arr[i-1]);
                    next[i]=point[i];
                  }
              else{
                  point[i]=Math.abs(arr[i-2]-arr[i]);
                  next[i]= Math.abs(arr[i-1]-arr[i]);
              }
      }
      i=0;
                
                // for(int j=0;j<n;j++) System.out.print(point[j]+" ");
                // System.out.println();
                // for(int j=0;j<n;j++) System.out.print(next[j]+" ");
      
                if( n==2) sum=Math.abs(arr[1]-arr[0]);
             else if(n==3){
                 	    int temp1=point[i+2];
                      	int temp2=next[i+2];
                      	sum=Math.min(temp1,temp2);
             } 
             
        else{
                sum+=point[i+2];
                i+=2;
                  while(i <= n-3)
                  {
                          	int temp1=point[i+2];
                          	int temp2=next[i+1];
                  		
                    			if(temp1 < temp2) {
                                	sum+=temp1;
                                //   	current=1;
                                  i+=2;
                                }
                          		else if(temp1>temp2){
                               		sum+=temp2;
                                //   	current=2;
                                  i++;
                                } 
                          		else{
                                      //@todo temp1 == temp2
                                        if(i == n-3){
                                            sum+=temp1;
                                         	 i+=2;
                                        }
                                      else{
                                        solveDiscrepancy(arr,point,next,n);
                                      }
                                }	
                  }
                
            	if(i == n-2) sum+=next[i+1];
            	long sum1=sum;
            // 	----------------------------------------------------------
            	i=0;
            	sum=next[i+1];
            	i++;
            	 while(i <= n-3)
                  {
                          	int temp1=point[i+2];
                          	int temp2=next[i+1];
                  		
                    			if(temp1 < temp2) {
                                	sum+=temp1;
                                //   	current=1;
                                  i+=2;
                                }
                          		else if(temp1>temp2){
                               		sum+=temp2;
                                //   	current=2;
                                  i++;
                                } 
                          		else{
                                      //@todo temp1 == temp2
                                        if(i == n-3){
                                            sum+=temp1;
                                         	 i+=2;
                                        }
                                      else{
                                        solveDiscrepancy(arr,point,next,n);
                                      }
                                }	
                  }
                  	if(i == n-2) sum+=next[i+1];
            	long sum2=sum;
            	
            	sum=Math.min(sum1,sum2);
                  
                  
            	
            	
        }
      	
      System.out.println(sum);
    }
}