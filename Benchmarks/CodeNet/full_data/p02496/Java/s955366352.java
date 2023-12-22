import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for(;;){
          int n = Integer.parseInt(buf.readLine());

//input
          int S=0; int H=0; int C=0; int D=0;
          int[] S_num = new int[14];
          int[] H_num = new int[14];
          int[] C_num = new int[14];
          int[] D_num = new int[14];
          for(int i=0; i<n; i++){
           String in = buf.readLine();
           String a = in.split(" ")[0];
           int b = Integer.parseInt(in.split(" ")[1]);
           if(a.equals("S")){
             S_num[b] = 1; S++;
           }else if(a.equals("H")){
             H_num[b] = 1; H++;
           }else if(a.equals("C")){
             C_num[b] = 1; C++;
           }else if(a.equals("D")){
             D_num[b] = 1; D++;
           }
         }

//output
          for(int s=1; s<14; s++){
            if(S_num[s]==0)System.out.println("S" + " " + s);
          }
          for(int h=1; h<14; h++){
            if(H_num[h]==0)System.out.println("H" + " " + h);
          }
          for(int c=1; c<14; c++){
            if(C_num[c]==0)System.out.println("C" + " " + c);
          }
          for(int d=1; d<14; d++){
            if(D_num[d]==0)System.out.println("D" + " " + d);
          }
      }
    }
    }