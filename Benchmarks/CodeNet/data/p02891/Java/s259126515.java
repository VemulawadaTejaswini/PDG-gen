
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         String S=gs();
         long K=gl();

         long tmp=1;
    	 char bc=S.charAt(0);
    	 List<Long>l= new ArrayList<Long>();
    	 for(int i=1; i<S.length();i++) {
    		 char c=S.charAt(i);
    		 if(bc==c) {
    			 tmp++;
    		 } else {
    			 l.add(tmp);
    			 tmp=1;
    		 }
    		 bc=c;
    	 }
    	 l.add(tmp);

         long ans=0;
         if(S.charAt(0)==S.charAt(S.length()-1)) {
             if(l.size()==1) {
            	 ans=S.length()*K/2;
             } else {
            	 long s=l.get(0);
            	 long e=l.get(l.size()-1);
            	 long a=0;
            	 a+=((s+e)/2)*(K-1);
            	 a+=s/2;
            	 a+=e/2;
            	 for(int i=1; i<l.size()-1;i++) {
            		 ans+=l.get(i)/2;
            	 }
            	 ans*=K;
            	 ans+=a;
             }
         } else {
        	 for(int i=0; i<l.size();i++) {
        		 ans+=l.get(i)/2;
        	 }
        	 ans*=K;
         }

         System.out.println(ans);
     }


     // 文字列として入力を取得
     public static String gs() {
          return scanner.next();
     }

     // intとして入力を取得
     public static int gi() {
          return Integer.parseInt(scanner.next());
     }

     // longとして入力を取得
     public static long gl() {
          return Long.parseLong(scanner.next());
     }

     // doubleとして入力を取得
     public static double gd() {
          return Double.parseDouble(scanner.next());
     }
}