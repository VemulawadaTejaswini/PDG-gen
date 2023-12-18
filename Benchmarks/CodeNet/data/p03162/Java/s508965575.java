import java.util.*;
public class Main{
  static class tutt{
  	int a,b,c;
    tutt(int a,int b,int c){
    	this.a=a;
        this.b=b;
        this.c=c;
    }
  
  }
  static long[][] aa;
  static long maxx(tutt[] tut,int flag,int ind){
  	if(ind>=tut.length){return 0;}
    
    if(aa[ind][flag]!=-1){return aa[ind][flag];}
    
   	if(flag==0){
    	return aa[ind][flag]=Math.max(maxx(tut,1,ind+1)+(long)tut[ind].a,
                                     Math.max(maxx(tut,2,ind+1)+(long)tut[ind].b ,
                                             maxx(tut,3,ind+1)+(long)tut[ind].c  ) );
    }
    else if(flag==1){
    	return aa[ind][flag]=Math.max(maxx(tut,2,ind+1)+(long)tut[ind].b,
                                      maxx(tut,3,ind+1)+(long)tut[ind].c ); 
    }
    else if(flag==2){
    	return aa[ind][flag]=Math.max(maxx(tut,1,ind+1)+(long)tut[ind].a,
                                      maxx(tut,3,ind+1)+(long)tut[ind].c); 
    }
    else{
    	return aa[ind][flag]=Math.max(maxx(tut,1,ind+1)+(long)tut[ind].a,
                                      maxx(tut,2,ind+1)+(long)tut[ind].b); 
    }
    
  }
  
  public static void main(String[] args){
  
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    tutt[] arr=new tut[n];
    for(int j=0;j<n;j++){
    	tutt temp=new tutt(s.nextInt(),s.nextInt(),s.nextInt() );
        arr[j]=temp;
    }
    aa=new long[n][4];
    for(int j=0;j<n;j++){
    	for(int i=0;i<4;i++){
         	aa[j][i]=-1;
        }
    }
    System.out.println(maxx(arr,0,0));
    
    
  }

}