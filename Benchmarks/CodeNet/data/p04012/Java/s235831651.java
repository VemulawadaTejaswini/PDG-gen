import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	String s = sc.next();
        char[] s_chars = s.toCharArray();
      	char ar[] = new char['z' - 'a' + 1];
      	int nam[] = new int[26];
      
      for(char i='a'; i<='z';i++) ar[i - 'a'] = i;
      
      for(int i = 0;i < s.length();i++){
        	char aa = s_chars[i];
       		for(int j = 0; j < 26;j++){
            if(ar[j]==aa){
            	nam[j] += 1; 
            }
          }
      }
      int flag = 0;
      for(int j = 0; j < 26;j++){
      		if(nam[j]%2!=0){
      		flag = 1;
            break;
      	}
      }
      
      if(flag==1){
      	System.out.print("No");
      }else{
      	System.out.print("Yes");
      }
        
        
        
    }
}