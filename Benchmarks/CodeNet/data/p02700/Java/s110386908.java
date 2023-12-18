import java.util.*;


		       public class Main {

		           public static void main(String args[])  {
		        	   Scanner sc =new Scanner(System.in);
		        	   int lifeA = sc.nextInt();
		        	   int attackA = sc.nextInt();
		        	   int lifeB = sc.nextInt();
		        	   int attackB = sc.nextInt();	
                      while(lifeA>0 && lifeB>0) {
                    	  if(lifeA>0) {
                    		  lifeB -= attackA;
                    	  }
                    	  if(lifeB>0){
                    		  lifeA -=attackB;
                    	  }

                      }
                      if(lifeA <lifeB) {
                    	  System.out.println("No");
                      }else {
                    	  System.out.println("Yes");
                      }

		           }
		       }


