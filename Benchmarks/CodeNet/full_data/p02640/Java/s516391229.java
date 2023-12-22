import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
      	int x=sc.nextInt();
      	int y=sc.nextInt();
      	boolean flag=false;
      	for(int i=0;i<=x;i++){
        	if(y==(i*2+(x-i)*4)){
				flag=true;
              	break;
            }
        }
      	System.out.println(flag? "Yes":"No");
    }
}