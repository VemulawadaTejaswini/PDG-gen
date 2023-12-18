import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    // 条件S
            long S = sc.nextLong();
	    //System.out.println(S);
            //切り出しする文字列
            String text = Long.toString(S);
            char[] work = new char[text.length()];

            List<String> listA = new ArrayList<String>(text.length());

            for(int i = 0; i < text.length(); i++){
                work[i] = text.charAt(i);
                //切り出した文字列を一文字ずつ出力
                //System.out.println(work[i]);
                listA.add(String.valueOf(work[i]));
        }
        //System.out.println(listA);
        //System.out.println(text.substring(0,2));
        int cnt = 0;
        long chk = 0;
        // int test =  Integer.parseInt(text.substring(0,2));
         //chk = test % 2019;
         //System.out.println(chk);
        for(int i=0; i<listA.size()-1; i++){
            for(int j=i+1; j<listA.size()+1; j++){
                   long test =  Long.parseLong(text.substring(i,j));
                   chk = test % 2019;
                   if( test > 2019 && chk == 0 ) {
                     System.out.println("test : " + test);
                     cnt++;
                   }
            }
        }
        System.out.println(cnt);
    }
}