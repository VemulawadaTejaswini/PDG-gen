import java.util.Scanner;

public class BaseballSimulation{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int count_out = 0, inning;
    int baseflag = 0;
    String str = "";
    String binary = "";

    inning = s.nextInt();

    int[] score = new int[inning];

    while(count_out < inning * 3){

      try{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        str = bf.readLine();
      }catch(Exception e){
        System.out.println(e);
      }

      if(str.equals("OUT")){
        count_out++;
      }else if(str.equals("HIT")){
        baseflag = baseflag << 1;
        baseflag++;

        if(baseflag > 8){
          baseflag -= 8;
          score[count_out/3]++;
        }
      }else if(str.equals("HOMERUN")){
        if(baseflag == 1 || baseflag == 2 || baseflag == 4){
          score[count_out/3] += 2;
        }else if(baseflag == 3 || baseflag == 5 || baseflag == 6){
          score[count_out/3] += 3;
        }else if(baseflag == 0){
          score[count_out/3]++;
        }else{
          score[count_out/3] += 4;
        }
        baseflag = 0;
      }
    }

    for(int i = 0;i < inning;i++){
      System.out.println(score[i]);
    }
  }
}