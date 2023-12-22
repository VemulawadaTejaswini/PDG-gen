import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String number = scan.nextLine();
    	String change = number.toLowerCase();
    	
    	char[] ca = change.toCharArray();
    	int[] count = new int[26];
    	int num;
    	char alphabet = 'a';
    	
    	for(int i = 0; i < ca.length; i++){
    		num = ca[i] - 'a';
    		if(num >= 0 && num < 26){
    			count[num]++;
    		}
    	}
    	
    	for(int i = 0; i < 26; i++){;
    		System.out.println(alphabet + ":" + count[i]);
    		alphabet += 1;
    	}
     }
}