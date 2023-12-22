import java.util.Scanner;

class Main{
  public static void main(String args[]){
    int abs=0;
    Scanner scn = new Scanner(System.in);
    int one=scn.nextInt();
    int tow=scn.nextInt();
    int thr=scn.nextInt();
    int fow=scn.nextInt();
    int time=scn.nextInt();
    for(int i=0;i<time;i++){
      one=one+tow;
      thr=thr+fow;
      if(one>=thr){
        System.out.println("YES");
        abs=1;
        break;
      }
    }
    if(abs!=1){
     System.out.println("NO");
    }
  }
}