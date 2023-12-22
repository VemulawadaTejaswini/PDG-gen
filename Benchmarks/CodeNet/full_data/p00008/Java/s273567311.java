import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    	int in,n,count,i,j,k,l;

       Scanner sc = new Scanner(System.in);

        count=0;

        while(sc.hasNext()) {

        	count = 0;

        	in = sc.nextInt();

            for(i=0;i<10;i++){
            	
                n=i;
                
                for(j=0;j<10;j++){
                	
                    n+=j;
                    
                    for(k=0;k<10;k++){
                    	
                        n+=k;
                        
                        for(l=0;l<10;l++){
                        	
                            if(n+l ==in){
                            	
                                count++;
                                
                            }
                        }
                        n-=k;
                    }
                    n-=j;
                }
            }
        System.out.printf("%d",count);
        }
    }

}