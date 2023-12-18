import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
        int cb = 0; 
        int cw = 0;
      	String S = sc.next();
      	String[] strls = S.split("");
      	for(int n = N-1;n >= 0;n--){
        	if(strls[n].equals(".") == true && n >0){
                 if(strls[n-1].equals("#") ==true){
                 	//strls[n]="#";
            		cb++;
                 }
            }   
        }
        for(int n = N-1;n >= 0;n--){
        	if(strls[n].equals("#") == true && n >0){
                 if(strls[n-1].equals(".") ==true){
                 	//strls[n]=".";
            		cw++;
                 }
            }   
        }
        int c = 0;
        if(cb < cw){
          	c=cb;
        }else{
          	c = cw;
        }
        System.out.println(c);   
    }
}