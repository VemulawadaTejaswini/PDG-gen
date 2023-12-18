import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int array[][] = new int[M][M];

        for (int i = 0; i < M; i++) {
            array[i][0] = sc.nextInt();
            String result = sc.next();
            int resultNum = 0;
            if (result.equals("AC")) {
                resultNum = 1;
            } else {
                resultNum = 0;
            }
            array[i][1] = resultNum;
        }

        int ACcount = 0; // ACのトータル回数
        int WAcount = 0; // WAのトータル回数

        int j = 0;
        while(j < M || ACcount == N) {
            if (array[j][1] == 1) {
                ACcount++;
                j++;
            } else if(array[j][1] == 0) {
                WAcount++;
            }
        }
        System.out.println(ACcount + " " + WAcount);

        // for (int j = 0; j < M; j++) {
        //     if (array[j][1] == 1) {
        //         ACcount++;
        //     } else if(array[j][1] == 0) {
        //         WAcount++;
        //     }
        // }
    }
}