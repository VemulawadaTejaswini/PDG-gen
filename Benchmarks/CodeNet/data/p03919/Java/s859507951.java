import java.util.*;
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
      	int w = sc.nextInt();
        String[] eng = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                        "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
      	int hitH=0;
      	int hitW=0;
      	String[][] s = new String[h][w];
      	for(int i = 0; i < h; i++){
        	for(int j = 0; j < w; j++){
            	s[i][j] = sc.next();
              	if(s[i][j].equals("snuke")){
                	hitH = i;
                  	hitW = j;
                  	break;
                }
            }
        }
      	System.out.println(eng[hitW] + (hitH+1));
      	
    }
}