import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String word = scan.next();
        int k = scan.nextInt();
        
        String x = word.substring(k-1,k);
        String ans = "";
        for(int i=0;i < n;i++){
        	if(word.substring(i,i+1).equals(x)){
            	ans = ans+x;
            } else {
            	ans = ans+"*";
            }
        }
        System.out.println(ans);
    }
}