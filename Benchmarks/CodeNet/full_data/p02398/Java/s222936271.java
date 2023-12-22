import java.io.*;
 
class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
     
    String[] strAry = str.split(" ");
     
    int x = Integer.parseInt(strAry[0]);
    int y = Integer.parseInt(strAry[1]);
    int z = Integer.parseInt(strAry[2]);
    
    int i, cnt = 0;
    
    for(i = 2; i <= z; i++){
    	if(z == 1)
    		break;
    	if(z % i == 0)
    		if(i >= x && i <= y)
    			cnt++;
    }
    System.out.println(cnt);
  }
}