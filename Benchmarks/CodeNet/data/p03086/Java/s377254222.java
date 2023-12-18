import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String word = scan.next();
      	int ans = 0;
      	int subans =0;
      	int check =0;
      	for(int i=0;i<word.length();i++){
        	if(word.substring(i,i+1).equals("C") || word.substring(i,i+1).equals("G") || word.substring(i,i+1).equals("T") ||word.substring(i,i+1).equals("A")){
            	subans++;
            } else {
            	if(ans < subans){
                	ans = subans;
                }
              	subans = 0;
            }
        }
      	System.out.println(ans);
    }
}