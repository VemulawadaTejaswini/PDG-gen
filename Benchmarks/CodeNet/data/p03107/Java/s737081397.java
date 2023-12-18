import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	sc.close();
    	int strt = S.length();
    	while(true){
    		S = S.replace("01", "");
    		S = S.replace("10", "");
    		if(S.length() == 0){
    			System.out.println(strt - S.length());
    			break;
    		}
    		char[] ary = S.toCharArray();
    		for(int i = 0; i < ary.length; i++){
    			if(ary[i] != '1'){
    				break;
    			}else if(i >= ary.length-1){
    				System.out.println(strt - S.length());
    				System.exit(0);
    			}
    		}
    		for(int i = 0; i < ary.length; i++){
    			if(ary[i] != '0'){
    				break;
    			}else if(i >= ary.length-1){
    				System.out.println(strt - S.length());
    				System.exit(0);
    			}
    		}
    	}

    }
}