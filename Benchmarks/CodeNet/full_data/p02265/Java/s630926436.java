import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 class Main{
	static LinkedList<Integer> list = new LinkedList<Integer>();
	
	public static void insert(int key){
		list.add(key);
	}
	
	public static void delete(int key){
		list.remove(key);
	}
	
	public static void deleteFirst(){
		list.removeFirst();
	}
	
	public static void deleteLast(){
		list.removeLast();
	}
	
	
public static void main(String[] args) {
	   int key,n,i,k;
	   
	   Scanner sc =new Scanner(System.in);
	   n=sc.nextInt();
	   
	   for(i=0;i<n;i++){
		 char com[] = sc.next().toCharArray();  
		 
		
	   if(com[0] =='i'){
		 key=sc.nextInt();
			  insert(key);
	    }else if(com[0]=='d'){
		   if(com.length>6){
			   if(com[6]=='F'){
				   deleteLast();
			   }else if(com[6]=='L'){
				   deleteFirst();
			   }
		   }else{
			   key=sc.nextInt();
			   for(k=list.size();k>0;k--){
				   if(list.get(k-1)==key){
					   delete(k-1);
					   break;
				   }
			     } 
               } 
	         } 
	       }
	   
	   
	   Collections.reverse(list);
	   System.out.println(list.toString().replaceAll("\\[|\\]","").replace(",", ""));
		   sc.close();
}
}