import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[][][] house = new int[4][3][10];

//      ???????????¨????????¨?±?????????°???0
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 10; k++){
                    house[i][j][k] = 0;
                }
            }
        }

//      ????????????????????±?????°n
        int n = Integer.parseInt(input);

        for(int i = 0 ; i < n; i++){
            input = br.readLine();
            String[] strArray = input.split(" ");

            int building = Integer.parseInt(strArray[0]) -1;    //?£?
            int floor = Integer.parseInt(strArray[1]) -1;       //???
            int room = Integer.parseInt(strArray[2]) -1;        //?????????
            int resident = Integer.parseInt(strArray[3]);      //?????°

            house[building][floor][room] += resident;
        }

//      ??????
        for(int i = 0; i < 4; i++){
//          ?£??????????
            if(i != 0){
                System.out.println("####################");
            }
                for(int l = 0; l < 3; l++){
                    for(int k = 0; k < 10; k++){
                        System.out.print(" ");
                        System.out.print(house[i][l][k]);
                    }
                    System.out.println();
                }
        }
    }
}