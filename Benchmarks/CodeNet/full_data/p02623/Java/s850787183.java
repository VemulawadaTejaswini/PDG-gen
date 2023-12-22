import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] setting = line.split(" ");
      
        int deskA = Integer.parseInt(setting[0]);
        int deskB = Integer.parseInt(setting[1]);
        int time = Integer.parseInt(setting[2]);
      List<Integer> booksA = new ArrayList<Integer>();
      List<Integer> booksB = new ArrayList<Integer>();
      
      line = sc.nextLine();
      String[] inputA = line.split(" ");
      for(String input : inputA){
        booksA.add(Integer.parseInt(input));
      }
      line = sc.nextLine();
      String[] inputB = line.split(" ");
      for(String input : inputB){
        booksB.add(Integer.parseInt(input));
      }
      
      int max = 0;
      int readAtime = 0;
      int count = 0;
      int readBtime = 0;
      int bMax = 0;
      for(int i=0;i<booksB.size();i++){
        if(readBtime + booksB.get(i) > time){
          break;
        }
        readBtime = readBtime + booksB.get(i);
        bMax++;
      }
      for(int i=0;i<booksA.size();i++){
        if(readAtime + booksA.get(i) > time){
          break;
        }
        readAtime = readAtime + booksA.get(i);
        int readAlltime = readAtime;
        count = i+1;
        for(int j=0;j<bMax;j++){
          if(readAlltime + booksB.get(j) > time){
          break;
          }
          readAlltime = readAlltime + booksB.get(j);
          count++;
        }
        max = Math.max(count,max);
      }
      
      System.out.println(String.valueOf(max));
    }
}