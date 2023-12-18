import java.io.*;
public class Main{
  public static void main(String[] args){
    int E869120=1;
    int square1001=1;
    int Max=16;
    int pair;
    String buf1,buf2,buf3;
    try{
      BufferedReader br
          = new BufferedReader(new InputStreamReader(System.in));

      buf1 = br.readLine();
      buf2 = buf1.substring(0,buf1.indexOf(" "));
      buf3 = buf1.substring(buf1.indexOf(" ")+1);
      E869120 = Integer.parseInt(buf2);
      square1001 = Integer.parseInt(buf3);

  } catch(Exception e) {
      System.out.print("Error:" + e);
  }
  if(E869120<=15&square1001<=15&E869120+square1001<=16&E869120>=1&square1001>=1){
   if(E869120>square1001){
     pair=E869120-square1001;
     if(pair<=7&E869120-pair<Max-(pair*2)){System.out.println("Yay!");}
     else{System.out.println(":(");}

   }
   if(E869120<square1001){
     pair=square1001-E869120;
     if(pair<=7&square1001-pair<Max-(pair*2)){System.out.println("Yay!");}
     else{System.out.println(":(");}

   }
   if(E869120==square1001){
     {System.out.println("Yay!");}


   }
 }


  }
}