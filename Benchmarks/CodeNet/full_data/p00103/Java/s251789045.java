import java.io.*;
class Main {
  static boolean base_1=false,base_2=false,base_3=false;
  static int outCount=0,scoreCount=0,dataset;
  public static void main(String[] args){
    try{
      String command;
      BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
      dataset=Integer.parseInt(b.readLine());
      for(int i=0;i<dataset;i++){
        while(outCount<3){
          command=b.readLine();
          if(command.equals("HOMERUN")){
            if(base_1){base_1=false;scoreCount++;}
            if(base_2){base_2=false;scoreCount++;}
            if(base_3){base_3=false;scoreCount++;}
            scoreCount++;
          }
          if(command.equals("HIT")){
            if(base_3){scoreCount++;base_3=false;}
            base_3=base_2;
            base_2=base_1;
            base_1=true;
          }
          if(command.equals("OUT")){
            outCount++;
          }
        }
        System.out.println(scoreCount);
        outCount=0;scoreCount=0;base_1=false;base_2=false;base_3=false;
      }
    }catch(IOException e){}
  }
}