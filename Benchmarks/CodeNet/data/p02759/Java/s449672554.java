import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int j=0; j < 3; j++){
            for(int i=0; i <3; i++){
                arr[j][i] = in.nextInt();
            }
        }
        int num = in.nextInt();
        int hit[] = new int[num];
        for(int i=0; i<num; i++){
            hit[i] = in.nextInt();
        }

        for(int j=0; j < 3; j++){
            for(int i=0; i <3; i++){
                for(int k=0; k<num; k++){
                    if(arr[j][i] == hit[i]){
                        arr[j][i] = 0;
                    }
                }
            }
        }

        // 探索
        int check[][] = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}
        
        };

        boolean flag = false;

        for(int j=0; j<check.length; j++){
            if(arr[check[j][0]/3][check[j][0]%3] + arr[check[j][1]/3][check[j][1]%3] + arr[check[j][2]/3][check[j][2]%3]){
                flag = true;
            }
        }
        if(flag){
            System.out.print("Yes");
        }else{
            System.out.print("No");

        }
        
    }
}