import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        String a=sc.next();
  		int ans=0;
  		int e=0;
  		String[] b=a.split("");
		for(int c=0;c<a.length();c++){
          e=Integer.parseInt(b[c]);
          if(e<5){
          	ans+=e;
          }else{
          	ans=ans+10-e;
          }
    	}
  if(a.length()>=2){
    if(Integer.parseInt(b[0])==9||Integer.parseInt(b[1])>5){
    	ans+=1;
    }
  }else{
  if(Integer.parseInt(b[0])>5){
  	ans++;
  }
  }
 	

    	System.out.println(ans);
    }
}
