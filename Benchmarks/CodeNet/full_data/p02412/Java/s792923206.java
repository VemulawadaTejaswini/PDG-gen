import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,i=0,j=0,k=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      c=0;
    try{
      String line = reader.readLine();
      String[] splitted = line.split(" ");
      a = Integer.parseInt(splitted[0]);
      b = Integer.parseInt(splitted[1]);
      if (a+b == 0) break;
		}catch(Exception e){
      break;
    }

    for(i = 1;i <= a-2;i++){
      for(j = 1;j <= a-1;j++){
        for(k = 1;k <= a;k++){
          if(i < j && j < k && i+j+k == b){ 
            c++;
          }

        }
      }
    }
    System.out.println(c);
  }
	}
}
