import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int output = 0;
      String lastChar = "";
      for(int i = 0; i < input.length(); i++){
        String tmp = input.substring(i , i + 1);
        if(lastChar.equals("")){
           lastChar = tmp;
         }else{
          if(!lastChar.equals(tmp)){
            lastChar = tmp;
            output++;
          }
        }
       }
      System.out.println(output);
	}
}
