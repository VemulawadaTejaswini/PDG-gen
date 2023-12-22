import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        int[][] ab = new int[2][4];
                        for(int i = 0; i < 2; i++){
                                for(int j = 0; j < 4; j++){
                                        ab[i][j] = sc.nextInt();
                                }
                        }
                        int hit = 0;
                        int blow = 0;
                        for(int i = 0; i < 4; i++){
                                if(ab[0][i] == ab[1][i]){
                                        hit++;
                                }else if(has(ab[0], ab[1][i])){
                                        blow++;
                                }
                        }
                        System.out.println(hit+" "+blow);
                }
                sc.close();
        }
        static boolean has(int[] a, int b){
                for(int i = 0; i < a.length; i++){
                        if(a[i] == b){
                                return true;
                        }
                }
                return false;
        }
}