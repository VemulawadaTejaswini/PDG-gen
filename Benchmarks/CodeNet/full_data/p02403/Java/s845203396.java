	import java.util.Scanner;
	public class Main{
			  public static void main(String[]args){
			    Scanner sc1 = new Scanner(System.in);
			    Scanner sc2 = new Scanner(System.in);
			    int H = sc1.nextInt();
			    int W = sc2.nextInt();
			    try{
		              for(int i = 0;i < H;++i) {
		            	  for(int j = 0;j < W;++j) {
		            		  System.out.printf("#");      		 
		            	  }
		            	  System.out.println("");
		            	  }
			    }catch(Exception e){
			    }
			    
			    	sc1.close();
			    	sc2.close();	    
			  }
			}

