import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
      	if(b != 0){
      		int c [] = new int[b];
      		for(int i = 0; i < b; i++){  
      			c [i] = sc.nextInt();
      		}
      	int d = -1;
        boolean f = true;
        boolean g = true;
		boolean h = true;
		// 出力
     	while(f && h){
        	f = false;
            h = false;
            d ++;
       		 for(int i = 0; i < b; i++){
     		 	if(( c[i] - a ) == d){
         			f = true;
         		}
               if(( c[i] - a ) == -d){
         			h = true;
         		}
     		}
        }
             for(int i = 0; i < b; i++){
     		 	if( c[i] - a  ==  -d){
         			g = false;
         		}
     		}
       if(g){
    	System.out.println(a - d);   	
       }else{
       	System.out.println(a + d);
       }
	
      } 
      else{
      	System.out.println( a );
      }
	}
}
