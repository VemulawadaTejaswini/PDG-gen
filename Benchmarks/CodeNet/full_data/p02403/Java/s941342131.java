import java.util.Scanner;
	public class Main{
			  public static void main(String[]args){
			    Scanner sc = new Scanner(System.in);
			    int H = sc.nextInt();
			    int W = sc.nextInt();
			    try{
		              for(int i = 0;i < W;++i) {
		            	  for(int j = 0;j < H;++j) {
		            		  System.out.printf("#");      		 
		            	  }
		            	  System.out.println("");
		            	  }
		        System.out.println("");        
			    }catch(Exception e){
			    }
			    
			    	sc.close();   
			  }
			}

