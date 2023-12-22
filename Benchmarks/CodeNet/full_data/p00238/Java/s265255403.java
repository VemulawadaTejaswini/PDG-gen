import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  
	  for(;;){
		  int time =sc.nextInt();
		  if(time==0)System.exit(0);
		  int n=sc.nextInt();
	 int study=0;	
	for(;n>0;n--){
			 int s=sc.nextInt();
			 int e=sc.nextInt();
		study+=e-s;
	  }
	if(time<=study) System.out.println("OK");
	else System.out.println(time - study);
	  }
   }
}