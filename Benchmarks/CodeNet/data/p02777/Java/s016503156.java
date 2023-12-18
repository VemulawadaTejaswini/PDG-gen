import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
		int k=sc.nextInt();
  		String[] s1=s.split("");
  		int[] n=new int[s.length()];
  
		for(int c=0;c<s.length();c++){
    		n[c]=Integer.parseInt(s1[c]);
    	}
  long ans=0;
  int leng=s.length();
    
  if(k==1){
    	ans+=(s.length()-1)*9;
      	ans+=n[0];
    }else if(k==2){
      if(leng>=3){
       ans+=(leng-1)*(leng-2)/2*9*9;
        ans+=9*(leng-1)*(n[0]-1);
        ans+=(leng-2)*9;
		ans+=n[1];
      }else if(leng==2){
      	ans+=n[1]+(n[0]-1)*9;
      }
  }else{
    if(leng>=4){
      for(int f=4;f<=leng;f++){
    ans+=9*9*9*(f-2)*(f-3)/2;
      }
     ans+=(n[0]-1)*9*9*(leng-1)*(leng-2)/2;
  	ans+=(leng-2)*(leng-3)/2*9*9;
        ans+=9*(leng-2)*(n[0]-1);
        ans+=(leng-3)*9;
		ans+=n[1];
    }else if(leng==3){
    	ans+=9*9*(n[0]-1)+(n[1]-1)*9+n[2];
    }
  }
    	System.out.println(ans);
    }
}