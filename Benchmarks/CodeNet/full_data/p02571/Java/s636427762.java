import java.util.*;
class Main2{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
    	String T = sc.next();
    	int Tl = T.length();
        String[] Tt = new String[Tl];
        int x = 0;

      	for (int i = 0; i  < Tl; i++){
          Tt[i] = T.substring(0,i);

    		if(S.contains(Tt[i]) && S.contains(Tt[i+1])){
				}
				else{
        		x = Tl - i -1;
              break;
        	}


         }
      System.out.println(x);
    }
 }
