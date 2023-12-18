import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] sheet = new int[3][3];
        boolean[][] result = new boolean[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Integer[] vals = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            for (int j = 0; j < 3; j++) {
                sheet[i][j] = vals[j];
            }
        }
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int sheetVal = sheet[j][k];
                    if (sheetVal == val) {
                        result[j][k] = true;
                    } 
                }
            }
        }

        sc.close();            
        boolean isOk = false;

        if (result[0][0] == result[0][1] == result[0][2] == true || result[1][0] == result[1][1] == result[1][2] == true
                || result[2][0] == result[2][1] == result[2][2] == true) {
            isOk = true;
            System.out.println("Yes");
        } else {
            for(int i = 0; i < 3; i++){
                boolean results = result[0][i];
                if(!results){
                    continue;
                }
                if(i == 0){
                    if(result[1][0]){
                        if(result[2][0]){
                            System.out.println("Yes");
                            isOk = true;
                            break;
                        } 
                    }

                    if(result[1][1]){
                        if(result[2][2]){
                            System.out.println("Yes");
                            isOk = true;
                            break;
                        }
                    }
                }else if(i == 1){
                    if(result[1][1] == result[2][1] == true){
                        System.out.println("Yes");
                        isOk = true;
                        break;
                    }
                }else{
                    if(result[1][2] == result[2][2] == true){
                        System.out.println("Yes");
                        isOk = true;
                        break;
                    }

                    if(result[1][1] == result[2][0] == true){
                        System.out.println("Yes");
                        isOk = true;
                        break;
                    }
                }
            }
        }

        if(!isOk){            
        System.out.println("No");
        }
    }
}