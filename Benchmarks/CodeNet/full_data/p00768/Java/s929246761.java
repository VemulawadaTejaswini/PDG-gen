import java.util.*;
 
class Main {
	
    public static void main(String[] args) {
         
       Scanner cin=new Scanner(System.in);
       
       while(true) {
    	   int M=cin.nextInt(),T=cin.nextInt(),P=cin.nextInt(),R=cin.nextInt();
    	   
    	   if(M==0)break;
    	   
    	   Score data[]=new Score[T+1];
    	   for(int i=0;i<=T;i++) {
    		   data[i]=new Score();
    		   data[i].team=i;
    	   }
    	   
    	   int wa[][]=new int[T+1][P+1];
    	   
    	   for(int i=0;i<R;i++) {
    		   int m=cin.nextInt(),t=cin.nextInt(),p=cin.nextInt(),j=cin.nextInt();
    		   if(j==0) {
    			   data[t].acpt++;
    			   if(wa[t][p]>0)data[t].tt+=m+20*wa[t][p];
    			   else data[t].tt+=m;
    		   }
    		   else {
    			   wa[t][p]++;
    		   }
    		   
    	   }
    	   
    	   //sort
    	   boolean flag=true;
    	   for(int i=0;flag;i++) {
    		   flag=false;
    		   for(int j=data.length-1;j>=2;j--) {
    			   
    			   if(data[j].acpt>data[j-1].acpt) {
    				   
    				   Score temp=data[j-1];
    				   data[j-1]=data[j];
    				   data[j]=temp;
    				   flag=true;
    			   }
    			   else if(data[j].acpt==data[j-1].acpt && data[j].tt<data[j-1].tt) {
    				   
    				   Score temp=data[j-1];
    				   data[j-1]=data[j];
    				   data[j]=temp;
    				   flag=true;
    			   }
    			   else if(data[j].acpt==data[j-1].acpt && data[j].tt == data[j-1].tt && data[j].team>data[j-1].team) {
    				   
    				   Score temp=data[j-1];
    				   data[j-1]=data[j];
    				   data[j]=temp;
    				   flag=true;
    			   }
    			   
    		   }
    	   }
    	   
    	   System.out.print(data[1].team);
    	   for(int i=2;i<=T;i++) {
    		   if(data[i].acpt<data[i-1].acpt || (data[i].acpt == data[i-1].acpt && data[i].tt > data[i-1].tt))System.out.print(","+data[i].team);
    		   else System.out.print("="+data[i].team);
    	   }
    	   System.out.println();
       }
    }
}

class Score{
	int team=0,acpt=0,tt=0;
}
