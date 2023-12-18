import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int q = scan.nextInt();
      	String word = scan.next();
      	int[] nums = new int[2*q];
      	for(int i=0;i<2*q;i++){
        	nums[i] = scan.nextInt();
        }
     	int[] ac = new int[word.length()];
      	ac[0] = 0;
      	for(int i=1;i<word.length();i++){
        	if(word.substring(i-1,i+1).equals("AC")){
            	ac[i] = ac[i-1]+1;
            } else {
            	ac[i] = ac[i-1];
            }
        }
      	int ans = 0;
      	for(int i=0;i<q;i++){
        	ans = -ac[nums[2*i]-1] + ac[nums[2*i+1]-1];
          	System.out.println(ans);
        }
    }
}