import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String s;
    	char[] sh;
        try{
          s = sc.next();
          sh = s.toCharArray();
        }catch(Exception e){
          return;
        }

		int changeCount = 0;
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