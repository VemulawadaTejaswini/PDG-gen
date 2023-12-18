    import java.util.*;
    public class Main {// Main
        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int d = sc.nextInt();
          String s  = sc.next();
          s = " " + s;
          int v = 1;
          for(int i=a;i<c-1;i++){
          if(s.substring(i,i+2).equals("##")) { v=0; break; }
          }
        
      for(int i=b;i<d-1;i++){
        if(v==1) break;
          if(s.substring(i,i+2).equals("##")) { v=0; break; }
          }
          int putin = 0;
       if(d<c && v==1){
         for(int i=b;i<d-1;i++){
           if(s.substring(i,i+3).equals("...")) { putin = 1; break; }
        }
        if(putin==1) v=1; else v=0;
    }		
          if(v==1) System.out.println("Yes");
          else System.out.println("No");
        }
    }