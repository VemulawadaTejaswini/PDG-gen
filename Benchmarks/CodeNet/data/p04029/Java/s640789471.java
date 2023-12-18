import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String str = scan.next();
      	
      	List<char> list = new ArrayList<>();
      	int j = 0;
      	for(int i = 0; i < str.length(); i++){
        	if(!(str.charAt(i) == 'B')){
            	list.add(str.charAt(i));
              	j = j + 1;
            }else if (!(j == 0)){
            	list.remove(j - 1);
            }
        }
      	
      	for(int k = 0; k<j; k++){
          	char out = list.get(k);
        	System.out.print(out);
        }
    }
}