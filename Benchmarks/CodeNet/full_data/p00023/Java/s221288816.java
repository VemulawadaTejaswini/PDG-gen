import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for(int i = 0; i < n; i++){
                        double[][] ab = new double[2][3];
                        for(int j = 0; j < 2; j++){
                                for(int k = 0; k < 3; k++){
                                        ab[j][k] = sc.nextDouble();
                                }
                        }
                        System.out.println(judge(ab));
                }
                sc.close();
        }
        static int judge(double[][] ab){
                double distance = Math.pow((ab[0][0]-ab[1][0])*(ab[0][0]-ab[1][0])+(ab[0][1]-ab[1][1])*(ab[0][1]-ab[1][1]),0.5);
                if(distance+ab[0][2] <= ab[1][2]){
                        return -2;
                }else if(distance+ab[1][2] <= ab[0][2]){
                        return 2;
                }else if(distance > ab[0][2]+ab[1][2]){
                        return 0;
                }else{
                        return 1;
                }
        }
}