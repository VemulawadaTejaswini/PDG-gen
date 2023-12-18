
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int H=gi();
         int W=gi();
         int K=gi();
         String[] s=new String[H];
         int[][] cake=new int[H][W];

         for (int i=0; i<H;i++) {
             s[i]=gs();
         }

         int lh=0;
         int ni=1;
         for (int i=0; i<H;i++) {
             String g=s[i];
             if (g.contains("#")) {
            	 boolean isFirst=true;
            	 for (int j=0; j<W;j++) {
            		 char c=g.charAt(j);
            		 if(c=='#') {
            			 if(isFirst) {
            				 isFirst=false;
            			 } else {
            				 ni++;
            			 }
            		 }
            		 cake[i][j]=ni;
            	 }
               ni++;
             } else {
            	 lh=i;
             }
         }

         for (int i=1; i<H;i++) {
             for (int j=0; j<W;j++) {
                 if(cake[i][j]==0) {
                     cake[i][j]=cake[i-1][j];
                 }
             }
         }

         for (int i=H-2; i>=0;i--) {
             for (int j=0; j<W;j++) {
                 if(cake[i][j]==0) {
                     cake[i][j]=cake[i+1][j];
                 }
             }
         }

         StringBuilder sb=new StringBuilder();
         for (int i=0; i<H;i++) {
             for (int j=0; j<W;j++) {
            	 if(j!=0)sb.append(" ");
                 sb.append(cake[i][j]);
             }
             sb.append(System.lineSeparator());
         }

         System.out.println(sb);
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