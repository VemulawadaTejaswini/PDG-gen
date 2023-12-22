import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


		public static void main(String[] args) {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


			  try{

				  String ab = input.readLine();
				  String[] strAry = ab.split(" ");

				 				  int a = Integer.parseInt(strAry[0]);
				  
				  int b = Integer.parseInt(strAry[1]);
				  int c = Integer.parseInt(strAry[2]);
				  int num =0;
				
									num=a;
					a=b;
					b=num;
				      if(b>c){
					     num=b;
					     b=c;
					     c=num;
				              if(a>b){
					           num=a;
					           a=b;
					           b=num;

				              }
				         }
				  }


				System.out.println(a+" "+b+" "+c);

			    }catch(IOException e) {   System.out.println("Exception : " + e);
			    }

		}
}