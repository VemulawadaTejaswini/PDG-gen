import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int N = sc.nextInt();
    int ay = sc.nextInt();
    int ax = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    
    for(int i=0;i<N;i++){
      	if(S.charAt(i) == "L"){
        	ax--;
      	}else if(S.charAt(i)=="R"){
        	ax++;
      	}else if(S.charAt(i)=="U"){
        	ay--;
      	}else if(S.charAt(i)=="D"){
        	ay++;
      	}
      
      	if(ax<=0 || ax>W || ay<=0 || ay>H){
        	System.out.println("NO");
          break;
      	}
      	
      
      	if(T.charAt(i)=="L"){
          if(ax>=2){
            ax--;
          }
      	}else if(T.charAt(i)=="R"){
          if(ax<W){
            ax++;
          }
      	}else if(T.charAt(i)=="U"){
          if(ay>=2){
            ay--;
          }
      	}else if(T.charAt(i)=="D"){
          if(ay<H){
        	ay++;
          }
      	}
      }
    
    if(ax>=1 && ax<=W && ay>=1 && ay<=H){
      System.out.println("YES");
    }
  }
}