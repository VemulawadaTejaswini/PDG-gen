
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
  		int[] a=new int[4];
		String ans="";
		
		a[0] = n/1000;
		a[1] = (n-a[0]*1000)/100;
		a[2] = (n-a[0]*1000-a[1]*100)/10;
		a[3] = n%10;
		
		if(a[0]+a[1]+a[2]+a[3]==7){
		    ans=""+a[0]+"+"+a[1]+"+"+a[2]+"+"+a[3]+"=7";
		}else if(a[0]+a[1]+a[2]-a[3]==7){
		    ans=""+a[0]+"+"+a[1]+"+"+a[2]+"-"+a[3]+"=7";
		}else if(a[0]+a[1]-a[2]+a[3]==7){
		    ans=""+a[0]+"+"+a[1]+"-"+a[2]+"+"+a[3]+"=7";
		}else if(a[0]+a[1]-a[2]-a[3]==7){
		    ans=""+a[0]+"+"+a[1]+"-"+a[2]+"-"+a[3]+"=7";
		}else if(a[0]-a[1]+a[2]+a[3]==7){
		    ans=""+a[0]+"-"+a[1]+"+"+a[2]+"+"+a[3]+"=7";
		}else if(a[0]-a[1]+a[2]-a[3]==7){
		    ans=""+a[0]+"-"+a[1]+"+"+a[2]+"-"+a[3]+"=7";
		}else if(a[0]-a[1]-a[2]+a[3]==7){
		    ans=""+a[0]+"-"+a[1]+"-"+a[2]+"-"+a[3]+"=7";
		}else if(a[0]-a[1]-a[2]-a[3]==7){
		    ans=""+a[0]+"-"+a[1]+"-"+a[2]+"-"+a[3]+"=7";
		}
		//System.out.println(""+a[0]+"+"+a[1]+"+"+a[2]+"+"+a[3]+"=7");
     	System.out.println(ans);
   }
}
