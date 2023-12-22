import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
        
	while(true){
	    String str=scan.next();
	    if(str=="-")break;
	    int m = scan.nextInt();
	    for(int n = 0; n < m ; n++){
		int l = scan.nextInt();
		String str1 = str.substring(l,str.length());
		String str2 = str.substring(0,l);
	        String str3 = str1.concat(str2);
                System.out.println(str3);
	    }
	}
    }
}