import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][][] rooms = new int[4][3][10];

        int max = scanner.nextInt();
        int b,f,r,v;
        for(int i = 0; i < max; i++){
            b = scanner.nextInt();
            f = scanner.nextInt();
            r = scanner.nextInt();
            v = scanner.nextInt();

            rooms[b-1][f-1][r-1] += v;
            if(rooms[b-1][f-1][r-1] < 0){
                rooms[b-1][f-1][r-1] = 0;
            }
            if(rooms[b-1][f-1][r-1] > 9){
                rooms[b-1][f-1][r-1] = 8;
            }
        }

        int count = 0;
       for(int[][] bi : rooms){
            for(int[] fi : bi){
                for(int ri : fi){
                    System.out.print( " " + ri);
                }
                System.out.println();
            }
            if(count != rooms.length-1){
                count++;
                System.out.println("####################");
            }

       }
        scanner.close();
    }
}

