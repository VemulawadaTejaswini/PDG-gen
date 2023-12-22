import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        boolean[][] cards = new boolean[4][13];

        for(int i=0; i<n; i++){
            String[] number = in.readLine().split(" ");
            switch(number[0].charAt(0)){
                case 'S':
                    cards[0][Integer.parseInt(number[1])-1] = true;
                    break;
                case 'H':
                    cards[1][Integer.parseInt(number[1])-1] = true;
                    break;
                case 'C':
                    cards[2][Integer.parseInt(number[1])-1] = true;
                    break;
                case 'D':
                    cards[3][Integer.parseInt(number[1])-1] = true;
                    break;
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                if(cards[i][j]==false){
                    switch(i){
                        case 0:
                            System.out.println("S " + (j+1));
                            break;
                        case 1:
                            System.out.println("H " + (j+1));
                            break;
                        case 2:
                            System.out.println("C " + (j+1));
                            break;
                        case 3:
                            System.out.println("D " + (j+1));
                            break;
                    }
                }
            }
        }

        in.close();
    }
}