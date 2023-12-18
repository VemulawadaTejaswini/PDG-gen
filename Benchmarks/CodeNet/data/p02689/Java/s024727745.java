import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int mt=scan.nextInt();
    int road=scan.nextInt();
    int[] high=new int[mt];
    boolean[] good=new boolean[mt];
    for(int a=0; a<mt; a++){
      high[a]=scan.nextInt();
      good[a]=true;
    }
    for(int a=0; a<road; a++){
      int x=scan.nextInt();
      int y=scan.nextInt();
      if(high[x-1]>high[y-1] && good[y-1]==true){
        good[y-1]=false;
        //System.out.println(y);
      }else if(high[x-1]<high[y-1] && good[x-1]==true){
        good[x-1]=false;
        //System.out.println(x);
      }else if(high[x-1]==high[y-1]){
        good[x-1]=false;
        good[y-1]=false;
      }
    }
    int ans=0;
    for(int a=0; a<good.length; a++){
      if(good[a]==true){
        ans++;
      }
    }
    System.out.println(ans);
  }
}