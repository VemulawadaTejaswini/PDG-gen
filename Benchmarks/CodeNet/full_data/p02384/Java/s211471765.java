import java.io.*;
 
class Main {
    public static void main(String[] args)throws IOException{ 
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);
 
       String number = read.readLine();
       String[] spli1 = number.split(" ");
       int [] dICE = new int [8];
       int num,count;
       for(count = 0; count < 8; count++){ 
           dICE[count] = 0;
       }
       for(num = 0; num < 6; num++){
           dICE[num] = Integer.parseInt(spli1[num]);      //??°????????\??£???????????????
       }


       int instructNum = Integer.parseInt(read.readLine());         //????????°     
       
      for(int limit = 0; limit < instructNum; limit++){
    	  
    	  
    	  String instruct = read.readLine();
          String[] instBOX = instruct.split(" ");
          int [] inst = new int [2];

          for(num = 0; num < 2; num++){
              inst[num] = Integer.parseInt(instBOX[num]);          //???????????????           
          }
          
          
      while(true){
        if(dICE[0] == inst[0] && dICE[1] == inst[1]){
        	//System.out.println("!");
          break;
        }
        else if(dICE[1] != inst[1]){     
              if(inst[1] == dICE[0]){
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[1];
                    dICE[0] = dICE[4];
                    dICE[1] = dICE[6];
                    dICE[2] = dICE[2];
                    dICE[3] = dICE[3];
                    dICE[4] = dICE[5];
                    dICE[5] = dICE[7];  
              }
              else if(inst[1] == dICE[2]){
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[3];
                    dICE[0] = dICE[2];
                    dICE[1] = dICE[1];
                    dICE[2] = dICE[5];
                    dICE[3] = dICE[6];
                    dICE[4] = dICE[4];
                    dICE[5] = dICE[7];
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[1];
                    dICE[0] = dICE[4];
                    dICE[1] = dICE[6];
                    dICE[2] = dICE[2];
                    dICE[3] = dICE[3];
                    dICE[4] = dICE[5];
                    dICE[5] = dICE[7];
              }
              else if(inst[1] == dICE[3]){
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[2];
                    dICE[0] = dICE[3];
                    dICE[1] = dICE[1];
                    dICE[2] = dICE[6];
                    dICE[3] = dICE[5];
                    dICE[4] = dICE[4];
                    dICE[5] = dICE[7];
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[1];
                    dICE[0] = dICE[4];
                    dICE[1] = dICE[6];
                    dICE[2] = dICE[2];
                    dICE[3] = dICE[3];
                    dICE[4] = dICE[5];
                    dICE[5] = dICE[7];       
              }
              else if(inst[1] == dICE[4]){
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[1];
                    dICE[0] = dICE[4];
                    dICE[1] = dICE[6];
                    dICE[2] = dICE[2];
                    dICE[3] = dICE[3];
                    dICE[4] = dICE[5];
                    dICE[5] = dICE[7];
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[1];
                    dICE[0] = dICE[4];
                    dICE[1] = dICE[6];
                    dICE[2] = dICE[2];
                    dICE[3] = dICE[3];
                    dICE[4] = dICE[5];
                    dICE[5] = dICE[7];  
              }
              else if(inst[1] == dICE[5]){
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[4];
                    dICE[0] = dICE[1];
                    dICE[1] = dICE[5];
                    dICE[2] = dICE[2];
                    dICE[3] = dICE[3];
                    dICE[4] = dICE[6];
                    dICE[5] = dICE[7];   
             }
        }
        else if(dICE[1] == inst[1] && dICE[0] != inst[0]){
              if(inst[0] == dICE[2]){
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[3];
                    dICE[0] = dICE[2];
                    dICE[1] = dICE[1];
                    dICE[2] = dICE[5];
                    dICE[3] = dICE[6];
                    dICE[4] = dICE[4];
              }
              else if(inst[1] == dICE[3]){
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[2];
                    dICE[0] = dICE[3];
                    dICE[1] = dICE[1];
                    dICE[2] = dICE[6];
                    dICE[3] = dICE[5];
                    dICE[4] = dICE[4];
                    dICE[5] = dICE[7];     
              }
              else if(inst[1] == dICE[5]){
                    dICE[6] = dICE[0];
                    dICE[7] = dICE[2];
                    dICE[0] = dICE[3];
                    dICE[1] = dICE[1];
                    dICE[2] = dICE[6];
                    dICE[3] = dICE[5];
                    dICE[4] = dICE[4];
                    dICE[5] = dICE[7];     
             }
         }
      }  
      System.out.println(dICE[2]);                   
    }
  }
}