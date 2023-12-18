import java.util.Scanner;

public class Main{
	public static void main(String []args)throws Exception{
    	Scanner sc=new Scanner(System.in);
      	int N=sc.nextInt();
      	boolean iswareru = false;
      	if((N==0)||(N>81)){
        	System.out.println("No");
        }
        else{
        	for(int i = 2;i<10;i++){
              if(N % i ==0){
                iswareru =true;
              }
            }
        }
        if(iswareru){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }  
          
    }
}