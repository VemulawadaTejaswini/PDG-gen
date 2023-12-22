import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	  public static void main(String[] args) {
		  
		String line;  
	    int n;
	    int count9=0,count8=0,count7=0,count6=0,count5=0,count4=0,count3=0,count2=0,count1=0,count0=0;
	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	        
	  	  line = reader.readLine();
		  n = Integer.parseInt(line);
	        
		  for(int i=0;;i++){
		  	String a;
		    a = reader.readLine();

		    int leng = a.length();
		    
	        for(int j=0;j<leng;j++){
	        String N = a.substring(2*j,2*j+1);
	        int num = new Integer(N).intValue();
	        if(num==9){
	        	count9 += 1;
	        	}else if(num==8){
		        	count8 += 1;
		        	}else if(num==7){
			        	count7 += 1;
			        	}else if(num==6){
				        	count6 += 1;
			        	}else if(num==5){
				        	count5 += 1;
			        	}else if(num==4){
				        	count4 += 1;
			        	}else if(num==3){
				        	count3 += 1;
			        	}else if(num==2){
				        	count2 += 1;
			        	}else if(num==1){
				        	count1 += 1;
			        	}else if(num==0){
				        	count0 += 1;
			        	}
	        }
	        for(int k=1;k<=count9;k++){
	        	System.out.print("9 ");
	        }
	        for(int k=1;k<=count8;k++){
	        	System.out.print("8 ");
	        }
	        for(int k=1;k<=count7;k++){
	        	System.out.print("7 ");
	        }
	        for(int k=1;k<=count6;k++){
	        	System.out.print("6 ");
	        }
	        for(int k=1;k<=count5;k++){
	        	System.out.print("5 ");
	        }
	        for(int k=1;k<=count4;k++){
	        	System.out.print("4 ");
	        }
	        for(int k=1;k<=count3;k++){
	        	System.out.print("3 ");
	        }
	        for(int k=1;k<=count2;k++){
	        	System.out.print("2 ");
	        }
	        for(int k=1;k<=count1;k++){
	        	System.out.print("1 ");
	        }
	        for(int k=1;k<=count0;k++){
	        	System.out.print("0 ");
	        }
	        
	        
	        
	      }
	    }
	      catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
}