import java.util.*;
class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
    	String T = sc.next();
    	int Tl = T.length;	
        String[] Tt = new String[Tl];
        int x = 0; //変更する文字列を表示
          
      	for (int i = 0; i < Tl; i++){
          Tt[i] = T.substring(0,i);
             
    		if(S.contains(Tt[i])){
        		x = Tl - i + 1;
        	}
        	else{
       			break;
       		}
         }
    }
 }