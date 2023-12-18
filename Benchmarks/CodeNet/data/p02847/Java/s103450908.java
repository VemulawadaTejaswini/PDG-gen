import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String day = sc.next();
    int answer = 0;

    if(day.contains("SUN")){
      answer = 7;
    }else if(day.contains("SAT")){
      answer = 1;
    }else if(day.contains("FRI")){
      answer = 2;
    }else if(day.contains("THU")){
      answer = 3;
    }else if(day.contains("WED")){
      answer = 4;
    }else if(day.contains("TUE")){
      answer = 5;
    }else if(day.contains("MON")){
      answer = 6;
    }

    System.out.println(answer);

  }
}