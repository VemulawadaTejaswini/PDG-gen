import java.io.*;
 
public class Main{
  public static void main(String[] args) throws Exception{
  		int inputNum=1;
  		int i=1;
  		while(inputNum==0){
  			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  			inputNum=Integer.parseInt(br.readLine());
  			if(inputNum==0) break;
  			System.out.println("Case "+i+": "+inputNum);
  			i++;
    }
  }
}