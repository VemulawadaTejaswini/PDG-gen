import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] setting = line.split(" ");
      
        int deskA = Integer.parseInt(setting[0]);
        int deskB = Integer.parseInt(setting[1]);
        int time = Integer.parseInt(setting[2]);
      List<Long> booksA = new ArrayList<Long>();
      List<Long> booksB = new ArrayList<Long>();
      
      line = sc.nextLine();
      String[] inputA = line.split(" ");
      booksA.add(Long.parseLong("0"));
      booksB.add(Long.parseLong("0"));
      for(int i=0;i<inputA.length;i++){
        booksA.add(Long.parseLong(inputA[i]) + booksA.get(i));
      }
      line = sc.nextLine();
      String[] inputB = line.split(" ");
      for(int i=0;i<inputB.length;i++){
        booksB.add(Long.parseLong(inputB[i]) + booksB.get(i));
      }
      
      int max = 0;
      int now = deskB;
      for(int i=0;i<=deskA;i++){
        if(booksA.get(i) > time){
          break;
        }
        while(now >= 0 && time < booksA.get(i) + booksB.get(now)){
          now--;
        }
        max = Math.max(max,i+now);
      }
      
      System.out.println(String.valueOf(max));
    }
}