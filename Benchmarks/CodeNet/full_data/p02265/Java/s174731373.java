import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,start=-1,end=-1,keyi,yoso=0;//start=-1 ->list(no item)
		final int LIMIT=1000000;
		String ord,o;
     Scanner sc = new Scanner(System.in);
     n=sc.nextInt();
     int[] data = new int[n];
     int[] next = new int[n];
     int[] befo=  new int[n];
     for(i=0;i<n;i++){
    	 if(yoso>=LIMIT) break;
    	 ord=sc.next();
    	 if(ord.equals("insert")){
    	  data[i]=sc.nextInt();
    	  if(start!=-1){
	      o=null;
	      yoso++;
	      while(true){
    		  next[i]=start;
    		  start=i;
    	   	  befo[next[i]]=i;
		  if(yoso<LIMIT&&i<n-1){
		      if((o=sc.next()).equals("insert")){
		      i++;
		      yoso++;
		      data[i]=sc.nextInt();
		      }else{
		        break;
		      }
		  }else{
		       break;
		  }
	      }
	      i++;
	       if(o!=null){
	        ord=o;
	      }
    	 }else{
    		 start=i;
    		 end=i;
		 next[i]=-1;
		 yoso++;
    	 }
    	 }
    	 if(ord.equals("delete")){
    		 if((keyi=search(data,next,start,sc.nextInt(),end))!=-1){
       	         if(start ==end){start =end = -1;
       	         yoso--;
       			 continue;
       			 }
    		 if(keyi==end){
    			 end=befo[end];
    			 next[end]=-1;
    			 yoso--;
    	 }else if(keyi==start){
    		 start=next[start];
    		 befo[start]=-1;
    		 yoso--;
    	 }else{
    		 next[befo[keyi]]=next[keyi];
    		 befo[next[keyi]]=befo[keyi];
    		 yoso--;
    	 }
    	 }
    	 }
    	 if(ord.equals("deleteFirst")){
   	      if(start ==end){
   	    	  yoso--;
   	    	start =end = -1;
   			 continue;
   			 }
    		 if(start!=-1){
    			 yoso--;
    		 start=next[start];
    		 }
    	 }
    	 if(ord.equals("deleteLast")){
    		 if(start!=-1){
    			 if(start ==end){start =end = -1;
    			 yoso--;
    			 continue;
    			 }
    			 if(befo[end]!=-1)
    			 end=befo[end];
    		 }else{
    			 start=-1;
    		 }
    		 yoso--;
    			 next[end]=-1;
    		 }
     }
     for(i=start;i!=next[end];i=next[i]){
    	 if(i!=end){
    		 System.out.print(data[i]+" ");
    	 }else{
    		 System.out.println(data[i]);
    	 }
    	 }
	}
	public static int search(int []data,int[]next,int start,int key,int end){
		int x;
		x=start;
		while(x !=end&&data[x]!=key){
			x=next[x];
		}
		if(x==end&& data[x]!=key) return -1;
		return x;
	}
	}	

