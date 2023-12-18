import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String s = scan.next();
        int length = s.length();
        int sublength =1;
      	int check = 0; 
        int ans = 0;
      	for(int i=0;i<length-1;i++){
        	if(s.substring(i,i+1).equals(s.substring(i+1,i+2))){
              if(check == 0){
              	ans += sublength;
                check =1;
              } else {
              	check = 0;
              }
              sublength =1;
            } else {
            	sublength++;
            }
        }
        if(check ==0){
        	ans+=sublength;
        }
        if(ans < (double)length/2){
        	System.out.println(ans);
        } else {
        	System.out.println(length - ans);
        }
    }
}