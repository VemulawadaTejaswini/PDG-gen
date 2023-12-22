import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int n;
    int [][][] room = new int[4][3][10];
    int b,f,r,v;

    for(int i=0; i<room.length; i++)
        for(int j=0; j<room[0].length; j++)
            for(int k=0; k<room[0][0].length; k++)
                room[i][j][k] = 0;

    Scanner in = new Scanner(System.in);

    n = in.nextInt();

    for(int i=0; i<n; i++){
        in.nextLine();
        b = in.nextInt();
        f = in.nextInt();
        r = in.nextInt();
        v = in.nextInt();

        room[b-1][f-1][r-1] += v;
    }

    for(int i=0; i<room.length; i++){
        for (int j=0; j<room[0].length; j++) {
            for(int k=0; k<room[0][0].length; k++){
                System.out.print(" " + room[i][j][k]);
            }
            System.out.println();
        }
        if(i <room.length-1)
            System.out.println("####################");
    }
  }
}