import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
       	int ans1=0;
  		int ans2=0;
  		int ans3=0;
  		int count=0;
        int n=sc.nextInt();
		int m=sc.nextInt();
  		
		for(int d=0;d<m;d++){
    		int s=sc.nextInt();
          	int c=sc.nextInt();
          
           		if(s==1){
                	if(ans1==0||ans1==c){
                      ans1=c;
                    }else{
                    	count++;
                    }
                }else if(s==2){
                	if(ans2==0||ans2==c){
                      ans2=c;
                    }else{
                    	count++;
                    }
                }else{
                	if(ans3==0||ans3==c){
                      ans3=c;
                    }else{
                    	count++;
                    }
                }
           
        }
  		
  
  if(n==3&&ans1==0){
    		count++;
    	}else if(n==2&&ans2==0){
  		count++;
  }
  
   if(count>0){
    		System.out.println(-1);
    	}else{
   	 System.out.println(Integer.parseInt(String.valueOf(ans1)+String.valueOf(ans2)+String.valueOf(ans3)));
   }
	
   
    
    }
}

