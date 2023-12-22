import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numbers = Integer.parseInt(br.readLine());
    String[] str_numbers = br.readLine().split(" ");
    int[] score = new int[str_numbers.length];

    for(int i = 0; i < score.length; i++){
      score[i] = Integer.parseInt(str_numbers[i]);
    }

    for(int i = 0; i < score.length; i++){
      for(int j = score.length - 1; j > 1; j--){
        if(score[j] < score[j-1]){
          int tmp = score[j];
          score[j] = score[j-1];
          score[j-1] = tmp;
        }
      }
    }

    int sum = 0;
    for(int i = 0; i < score.length; i++){
      sum += score[i];
    }

    System.out.println(score[0] + " " + score[score.length - 1] + " " + sum);
  }
}

