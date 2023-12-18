
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         String S=gs();

         int[] red=new int[N];
         int[] green=new int[N];
         int[] blue=new int[N];
         for(int i=0; i<S.length();i++) {
        	 char c=S.charAt(i);
        	 if(i!=0) {
        	     red[i]=red[i-1];
        	     green[i]=green[i-1];
        	     blue[i]=blue[i-1];
        	 }
        	 if(c=='R') {
        		 red[i]++;
        	 } else if(c=='G') {
        		 green[i]++;
        	 } else {
        		 blue[i]++;
        	 }
         }

         long ans=0;
         for (int i=0; i<N;i++) {
        	 char ci=S.charAt(i);
        	 for (int j=i+1; j<N;j++) {
            	 char cj=S.charAt(j);
            	 if(ci!=cj) {
            		 if((ci=='R' && cj=='G') || (ci=='G' && cj=='R')){
            			 ans+=blue[N-1]-blue[j];
            			 if(j+(j-i)<N && S.charAt(j+(j-i))=='B')ans--;
            		 } else if((ci=='B' && cj=='G') || (ci=='G' && cj=='B')){
            			 ans+=red[N-1]-red[j];
            			 if(j+(j-i)<N && S.charAt(j+(j-i))=='R')ans--;
            		 } else if((ci=='R' && cj=='B') || (ci=='B' && cj=='R')){
            			 ans+=green[N-1]-green[j];
            			 if(j+(j-i)<N && S.charAt(j+(j-i))=='G')ans--;
            		 }
            	 }
             }
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