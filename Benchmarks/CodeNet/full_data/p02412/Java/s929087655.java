import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N[] = new int[9999];
    int X[] = new int[9999];
    int i=0,S=0;

    do{
      N[i] = scanner.nextInt();
      X[i] = scanner.nextInt();
      i++;
    }while(!(N[i-1]==0&&X[i-1]==0));

    for(int j=0;j<i-1;j++){
      S = 0;
      for(int x=1;x<=N[j];x++){
        for(int y=1;y<=N[j];y++){
          for(int z=1;z<=N[j];z++){
            if(x+y+z==X[j]&&x!=y&&x!=z&&y!=z){
              S++;
            }
          }
        }
      }
      System.out.println(S/6);
    }


  }
}
