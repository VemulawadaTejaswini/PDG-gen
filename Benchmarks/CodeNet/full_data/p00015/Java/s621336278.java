import java.util.Scanner;

public class Main {

	private static final int  UNIT =                  17;
    private static final long DIV  = 100000000000000000L;

    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
        	String ans = add(sc.next(),sc.next());

           	//output
        	System.out.println(ans);
        }
    }

    private static String add(String a,String b){

    	//initialization
    	String[] a_div,
    	         b_div;
        String   ans = "";

    	for(long buf,carry = 0;!(a.equals("") && b.equals("") && carry == 0);){

    		//division
    		a_div = splitStr(a);
    		b_div = splitStr(b);

    		//calculation
    		buf = Long.parseLong(a_div[1].equals("")?"0":a_div[1]) +
    			  Long.parseLong(b_div[1].equals("")?"0":b_div[1]) +
    			  carry;

    		//update
    		carry = buf / DIV;
   			ans = String.valueOf(String.format("%1$017d",buf%DIV)) + ans;
    		a = a_div[0];
    		b = b_div[0];
    	}

    	return zeroSprs(ans);
    }

    //divide string.
    private static String[] splitStr(String s){

    	//initialization
    	int len   = s.length();
    	int split = len - UNIT;
    	String[] s_ar = new String[2];

    	//division
    	if(split > 0){
    		s_ar[0] = s.substring(0,split);
    		s_ar[1] = s.substring(split);
   		} else {
    		s_ar[0] = "";
    		s_ar[1] = s;
   		}

    	return s_ar;
    }

    //zero suppress.
    private static String zeroSprs(String s){
    	char[] c_ar = s.toCharArray();
    	String ret = "";
    	boolean zeroSprsFlg = true;
    	for(char c:c_ar){
    		if(c != '0')    {zeroSprsFlg = false;}
    		if(!zeroSprsFlg){ret += String.valueOf(c);}
    	}
    	if(ret.equals("")){ret = "0";}
    	return ret;
    }
}