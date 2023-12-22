import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //??????????????¶??°?????\???
   int n = Integer.parseInt(br.readLine());
   //??????????????¨?±?
   String[] room = new String[120];

   //??????????????¨?±???????????????°
   int[] number = new int[120];
   
    int roomnumber = 0;
    for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
               for(int k =0 ; k < 10; k++){
                  room[roomnumber] = i + j + k;
                  roomnumber++;
               }
            }//for
    }//for


  }
}