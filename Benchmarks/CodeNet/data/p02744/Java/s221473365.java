import java.util.*;

public class Main{
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	int n = itr.nextInt();
      
      	List<String> res = new ArrayList<>();
      	res.add("a");
      
      	for (int i = 1; i < n; i++) {
        	List<String> tmp = new ArrayList<>();
          	for (String s : res) {
            	char last = (char)(s.charAt(s.length() - 1) + 1);
              	char cur = 'a';
              
              	while (cur <= last) {
                	tmp.add(s + cur);
                  	cur = (char) (cur + 1);
                }
            }
          
          	res = tmp;
        }
      
      	for (String item : res)
          System.out.println(item);
    }
}
