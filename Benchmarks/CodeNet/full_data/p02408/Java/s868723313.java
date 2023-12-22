import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        int card[][];
        card = new int[4][13];
        for(int i=0;i<4;i++){
          for(int j=0;j<13;j++){
            card[i][j] = 0;
          }
        }

        for(int k=1;k<=c;k++){
          String m = sc.next();
          int n = sc.nextInt();
            if (m.equals("S")){
              card[0][n-1] = 1;
            }
            if (m.equals("H")){
              card[1][n-1] = 1;
            }
            if (m.equals("C")){
              card[2][n-1] = 1;
            }
            if (m.equals("D")){
              card[3][n-1] = 1;
            }
        }

        for(int x=0;x<4;x++){
          for(int y=0;y<13;y++){
            if (card[x][y] == 0){
              if (x==0){
                System.out.println("S " + (y+1));
              }
              if (x==1){
                System.out.println("H " + (y+1));
              }
              if (x==2){
                System.out.println("C " + (y+1));
              }
              if (x==3){
                System.out.println("D " + (y+1));
              }
            }
          }
        }
    }
}
