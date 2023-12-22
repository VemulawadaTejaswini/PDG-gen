import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {
      int [][] color={ {0,0,0},{0,0,255},{0,255,0},{0,255,255},{255,0,0},{255,0,255},{255,255,0},{255,255,255} };
      String [] name ={"black","blue","lime","aqua","red","fuchsia","yellow","white"};
      
      Scanner sc = new Scanner(System.in);
   
      while(sc.hasNext()){
          String str = sc.nextLine();
          if(str.equals("0")) break;
          String ans = "";
          double max = 0;
          for(int i=0;i<8;i++){
              double d = Math.sqrt( (Integer.parseInt(str.substring(1,3),16)-color[i][0])*(Integer.parseInt(str.substring(1,3),16)-color[i][0]) + (Integer.parseInt(str.substring(3,5),16)-color[i][1])*(Integer.parseInt(str.substring(3,5),16)-color[i][1]) + (Integer.parseInt(str.substring(5,7),16)-color[i][2])* (Integer.parseInt(str.substring(5,7),16)-color[i][2]));
              if(d>max){
                  max=d;
                  ans=name[i];
              }
          }
          System.out.println(ans);
      }
      
   }
}

