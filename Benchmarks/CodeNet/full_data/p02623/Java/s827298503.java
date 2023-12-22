import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int deskA = sc.nextInt();
    int deskB = sc.nextInt();
    int limit = sc.nextInt();
    
    int[] timeA=new int[deskA];
    int[] timeB=new int[deskB];
    for (int i=0;i<deskA;i++){
      timeA[i]=sc.nextInt();
    } for (int i=0;i<deskB;i++){
      timeB[i]=sc.nextInt();
    }
    int time=0;
    int num=0;
    int readA=0;
    int readB=0;
    while (time<limit){
      if (readA==deskA && readB==deskB) {
        break;
      } else if (readA==deskA) {
        time = time + timeB[readB];
        readB = readB+1;
      } else if (readB==deskB) {
        time = time + timeA[readA];
        readA = readA+1;
      } else {
        time = time + Math.min(timeA[readA],timeB[readB]);
        if (timeA[readA]<=timeB[readB]) {
          readA=readA+1;
        } else {
          readB=readB+1;
        }
      }
    }
    if (time==limit || readA+readB==deskA+deskB) {
      System.out.println(readA+readB);
    } else {
      System.out.println(readA+readB-1);
    }
  }
}