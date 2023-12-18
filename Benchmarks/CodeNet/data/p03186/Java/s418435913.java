import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    	Scanner sc =new Scanner(System.in);
    	 int a = sc.nextInt();
    	 int b = sc.nextInt();
    	 int c = sc.nextInt();
    	
    	int d = 0;
    	while(true){
          	if(c != 0){
          		c--;
                d++;
            }else{
              break;
            }
          	if(b != 0){         	
          	b--;
            d++;
            }else{
              break;
            }
       }
    		if(c==0){
              d=d+b;
            }
    		if(b==0){
             while(true){
               if(c != 0){
                 c--;
                 d++;
            	}else{
                 break;
               }
               if( a!=0){
                 a--;
               }else{
                 break;
               }
             }
            }
    		System.out.println(d);
        }
}