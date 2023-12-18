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
    String[] strArrayS = new String[S.length()];
    String[] strArrayT = new String[T.length()];
    for (int i=0;i<N;i++) {
      strArrayS[i] = S.charAt(i);
      strArrayT[i] = T.charAt(i);
	}
    
    for(int i=0;i<N;i++){
      	if(strArrayS[i] == "L"){
        	ax--;
      	}else if(strArrayS[i]=="R"){
        	ax++;
      	}else if(strArrayS[i]=="U"){
        	ay--;
      	}else if(strArrayS[i]=="D"){
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


