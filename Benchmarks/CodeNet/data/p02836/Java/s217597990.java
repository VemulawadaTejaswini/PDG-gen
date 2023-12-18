import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
		int changeCount = 0;
		char[] sh = s.toCharArray();
      	if(s.length() % 2 == 0){
        	for(int i = 0; i < s.length() / 2; i++){
              	if(!(sh[i] == sh[(s.length() - 1) - i])){
              		sh[((s.length() - 1) - i)] = sh[i];
              		changeCount++;
                }
            }
        }else{
        	for(int i = 0; i < (s.length() + 1) / 2; i++){
              	if(!(sh[i] == sh[(s.length() - 1) - i])){
	          		sh[((s.length() - 1) - i)] =  sh[i];
              		changeCount++;
                }
            }
        }
		System.out.println(sh);
		System.out.print(changeCount);
	}
}