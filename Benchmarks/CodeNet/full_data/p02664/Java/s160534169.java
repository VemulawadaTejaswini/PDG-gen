import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String[] strArray = new String[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
            // 配列に順番に格納する
            strArray[i] = String.valueOf(s.charAt(i));
        }
        
        int countP = 0;
        int countD = 0;
        int countQ = 0;
        
        
        for (int i = 0; i < strArray.length; i++) {
           if (i == 0) {
               if(strArray[i].equals("?")) strArray[i] = "P";
           } else {
               if(strArray[i - 1].equals("P")) strArray[i] = "D";
               if(strArray[i - 1].equals("D")) strArray[i] = "P";
           }
        }
        
        String result = "";
        
        for (int i = 0; i < strArray.length; i++) {
            result += strArray[i];
        }
        
        System.out.println(result);
	}
}