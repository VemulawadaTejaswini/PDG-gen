 import java.util.*;
 
 class Main{
 	  public static void main(String[] args) {
 	  	
 	  	Scanner str = new Scanner(System.in);
 	  	ArrayList<String> note = new ArrayList<String>();
 	  	
	 	  	while(str.hasNext()){
	 	  		
	 	  		String s = str.next();
	 	  		if(s.indexOf("0") > 0 || s.startsWith("0")){
	 	  			break;
	 	  		}else{
	 	  			note.add(s);
	 	  		}
	 	  		
	 	  	}
 	  	
 	  	for(int i = 0; i < note.size(); i++){
 	  			System.out.println("Case " + (i + 1) + ": " +  note.get(i));
 	  	}
 	  }
 }