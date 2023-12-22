import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,start=-1,end=-1,keyi;//start=-1 ->list(no item)
		String ord;
     Scanner sc = new Scanner(System.in);
     n=sc.nextInt();
     int[] data = new int[n];
     int[] next = new int[n];
     int[] befo=  new int[n];
     for(i=0;i<n;i++){
    	 ord=sc.next();
    	 if(ord.equals("insert")){
    	  data[i]=sc.nextInt();
    	  if(start!=-1){
    		  next[i]=start;
    		  start=i;
    	   	  befo[next[i]]=i;
    	 }else{
    		 start=i;
    		 end=i;
    	 }
    	 }
    	 if(ord.equals("delete")){
   	      if(start ==end){start =end = -1;
   			 continue;
   			 }
    		 if((keyi=search(data,next,start,sc.nextInt(),end))!=-1){
    		 if(keyi==end){
    			 end=befo[end];
    			 next[end]=-1;
    	 }else if(keyi==start){
    		 start=next[start];
    		 befo[start]=-1;
    	 }else{
    		 next[befo[keyi]]=next[keyi];
    		 befo[next[keyi]]=befo[keyi];
    	 }
    	 }
    	 }
    	 if(ord.equals("deleteFirst")){
   	      if(start ==end){
   	    	start =end = -1;
   			 continue;
   			 }
    		 if(start!=-1){
    		 start=next[start];
    		 }
    	 }
    	 if(ord.equals("deleteLast")){
    		 if(start!=-1){
    			 if(start ==end){start =end = -1;
    			 continue;
    			 }
    			 if(befo[end]!=-1)
    			 end=befo[end];
    		 }else{
    			 start=-1;
    		 }
    			 next[end]=-1;
    		 }
     }
     for(i=start;i!=next[end];i=next[i]){
    	 if(i!=end &&next[i]!=end){
    		System.out.println(data[i]+" "+data[next[i]]+" "); 
    	 }
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


