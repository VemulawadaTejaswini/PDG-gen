import java.util.*;
class Main {
    public static void main(String[] args) {
     // TODO 自動生成されたメソッド・スタブ
	Scanner sc = new Scanner(System.in);
	      int H = sc.nextInt();
	      int W = sc.nextInt(); sc.nextLine(); //nextIntの後残る改行文字を消す
	      String[] line = new String[W];
	      int r=0;
	      for(int i=0;i<W;i++){
	      	line[i]=sc.nextLine();
	      } 
	      String[][] a = new String[H][W];
	      String[][] b = new String[H+2][W+2];
	         for(int j=0;j<W;j++){
	          for(int k=0;k<H;k++){
	           a[k][j]=String.valueOf(line[j].charAt(k));
	           b[k+1][j+1]=a[k][j];
	          }
	         }
	         sc.close();
	         for(int j=0;j<W+2;j++){
	          for(int k=0;k<H+2;k++){
	           b[0][j]=".";
	           b[H+1][j]=".";
	           b[k][0]=".";
	           b[k][W+1]=".";
	          }
	         }
	          
	         for(int j=0;j<W+2;j++){
	          for(int k=0;k<H+2;k++){
	          if(b[k][j].equals("#")){
	                   if(b[k+1][j].equals(".")&&b[k-1][j].equals(".")&&b[k][j+1].equals(".")&&b[k][j-1].equals(".")){
	                                       r+=1;
	                      }else{
	                                       r+=0;
	                       }
	           }
	          }
	         }
	           if(r>0){
	                 System.out.println("No");
	           }else{
	                 System.out.println("Yes");      
	           }
   }
}