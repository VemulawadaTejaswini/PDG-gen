import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H[] = new int[N];
        String result = "Yes";
        int count = 0;
        int min = 0;
        for (int i = 0; i< N; i++){
            H[i] = sc.nextInt();
            if (i == 0){
                min = H[0]-1;
            }else if (min <H[i]-1){

                min = H[i]-1;
            }
            if(H[i]<min){
                result = "No";
                break;
            }



//            if (i>0&&H[i-1] > H[i]){
//                if(count >0){
//                    result = "No";
//                    break;
//                }
//                count ++;
//            }
        }

        System.out.println(result);


    }
}
