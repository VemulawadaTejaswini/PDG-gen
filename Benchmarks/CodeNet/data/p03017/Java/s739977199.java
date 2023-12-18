import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt() -1;
    int b = sc.nextInt()-1;
    int c = sc.nextInt()-1;
    int d = sc.nextInt()-1;
    String s = sc.next() + "##";
    int istack,istack2;
    String sstack = s;
    boolean pat[] = new boolean[n+2];
    boolean pat2[] = new boolean[n+2];
    boolean pos = false;
    
    for(int i = 0;i < n+2;i++){
      if(s.charAt(i) == '#') pat[i] = false;
      else pat[i] = true;
    }
    for(int i = 0;i < n;i++) pat2[i] = pat[i];
    pat[a] = false;
    pat[b] = false;
    istack = a;
    istack2 = b;
    
    while(istack != c){
      if(pat[istack+2]){
        pat[istack]=true;
        istack += 2;
        pat[istack]=false;
      } else if(pat[istack+1]){
        pat[istack]=true;
        istack ++;
        pat[istack]=false;
      } else break;
    }
    if(istack == c){
      while(istack2 !=d){
        if(pat[istack2+2]){
          pat[istack2]=true;
          istack2 += 2;
          pat[istack2]=false;
        } else if(pat[istack2+1]){
          pat[istack2]=true;
          istack2++;
          pat[istack2]=false;
        } else break;
      }
      if(istack2 == d) pos = true;
    }
    if(!pos){
      istack = a;
      istack = b;
      for(int i = 0;i < n;i++) pat[i] = pat2[i];
      while(istack2 !=d){
          if(pat[istack2+2]){
            pat[istack2]=true;
            istack2 += 2;
            pat[istack2]=false;
          } else if(pat[istack2+1]){
            pat[istack2]=true;
            istack2++;
            pat[istack2]=false;
          } else break;
        }
        if(istack2 == d) {
          while(istack != c){
            if(pat[istack+2]){
              pat[istack]=true;
              istack += 2;
              pat[istack]=false;
            } else if(pat[istack+1]){
              pat[istack]=true;
              istack ++;
              pat[istack]=false;
            } else break;
          }
            if(istack == c) pos = true;
        }
    }
    
  	if(pos) System.out.println("Yes");
    else System.out.println("No");
    
    
  }
}
