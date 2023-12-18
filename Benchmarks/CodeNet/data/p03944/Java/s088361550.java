import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
      	boolean ws[] = new boolean[w];
      	boolean hs[] = new boolean[h];
      	int x,y,a;
      	int ww = 0;
      	int hw = 0;
      
      	Arrays.fill(ws,true);
      	Arrays.fill(hs,true);
      
      	for(int i = 0;i < n;i++){
          x = sc.nextInt();	
          y = sc.nextInt();	
          a = sc.nextInt();
          switch(a){
            case 1:
              for(int j=0;j<x;j++) ws[j] = false;
              break;
            case 2:
              for(int j=x;j<w;j++) ws[j] = false;
              break;
            case 3:
              for(int j=0;j<y;j++) hs[j] = false;
              break;
            case 4:
              for(int j=y;j<h;j++) hs[j] = false;
              break;
          }
        }
      
      	for(int i = 0;i < w;i++){
       	  if(ws[i]) ww++;
        }
      	for(int i = 0;i < h;i++){
       	  if(hs[i]) hw++;
        }

		System.out.println(hw*ww);
	}
}