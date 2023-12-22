import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ????????¢????????? {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  String str = br.readLine();
  String[] strAry = str.split(" ");
   int W= Integer.parseInt(strAry[0]);
   int H = Integer.parseInt(strAry[1]);
  int  i; 
  int  j ;
   for ( i =0; i < W;i++){
	   for ( j=0; j< H;j ++){
		   System.out.print("#");
	   }
	   System.out.print("\n");
	   }
	   
	   
   }

}	