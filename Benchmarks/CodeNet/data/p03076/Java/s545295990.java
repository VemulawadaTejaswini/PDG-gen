import java.util.*;

class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
        int[] dish = new int[5];
        int time = 0;
        int ama = 0;
        int cha = 0;
        int kaisa= 0;

        for(int i = 0;i < dish.length;i++){
            dish[i] = sc.nextInt();
        }

        for(int i =0;i < dish.length;i++){
            for(int j = i+1;j < dish.length;j++){
                dish[j] = dish[i];
                cha %= dish[j]/10;
                ama = 10-cha;
                time += dish[j] + ama;
            }
        }
  }
}