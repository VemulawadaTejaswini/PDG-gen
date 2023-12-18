import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        final int X = sc.nextInt();
        int sum = 0;
        int count = 0;

        for( int i = 0; i < A; i++ ){
            int hun5 = 500 * i;
            if( hun5 == X ){
                count++;
            }else{
                sum = hun5;
                if( sum == X ){
                    count++;
                }
            }
            for( int j = 0; j < B; j++ ){
                int hun = 100 * j;
                if( hun == X ){
                    count++;
                }else{
                    sum = sum + hun;
                    if( sum == X ){
                        count++;
                    }
                }
                for( int k = 0; k < C; k++ ){
                    int ten5 = 50 * k;
                    if( ten5 == X ){
                        count++;
                    }else{
                        sum = sum + ten5;
                        if( sum == X ){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}