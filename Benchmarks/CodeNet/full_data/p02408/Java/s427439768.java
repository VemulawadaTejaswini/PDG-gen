import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int num,i,j;
  num = Integer.parseInt(br.readLine());
  int[][] cards = new int[4][13];   
   for(int i=0;i<4;i++){
    for(j=0;j<13;j++){
     cards[i][j]=0;
    }
   }

   for(int i=0;i<num;i++){ 
    String str = br.readLine(); 
    String[] strAry = br.readLine().split(" ");
    String op = strAry[0];
    int number = Integer.parseInt(strAry[1]);
    number--;   

    if(op.equals("S")){            
      cards[0][number]=1; 
    }else if(op.equals("H")){
      cards[1][number]=1;
    }else if(op.equals("C")){
      cards[2][number]=1;
    }else if(op.equals("D")){
      cards[3][number]=1;
    }

   }
    
System.out.println("D "+ 5);
 }
}