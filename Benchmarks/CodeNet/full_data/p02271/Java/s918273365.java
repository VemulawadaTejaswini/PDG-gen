import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }

        int q = stdIn.nextInt();
        int[] m = new int[q];

        for(int i=0; i<q; i++){
            m[i] = stdIn.nextInt();
        }

        for(int i=0; i<q; i++){
            boolean[] bit = new boolean[n];
            boolean clearflag = false;
            do{
                int sum = 0;
                for(int j=0; j<bit.length; j++){
                    if(bit[j]){
                        sum += a[j];
                    }
                }
                if(sum == m[i]){
                    System.out.println("yes");
                    clearflag = true;
                    break;
                }
                changeBit(bit);
            }while(!finish(bit));

            if(!clearflag){
                System.out.println("no");
            }
        }
    }

    static void changeBit(boolean[] bit){
        boolean carryBit = true;
        for(int i=0; i<bit.length; i++){
            if(carryBit){
                if(bit[i]){
                    bit[i] = false;
                }else{
                    bit[i] = true;
                    carryBit = false;
                }
            }
        }
    }

    static boolean finish(boolean[] bit){
        for(int i=0; i<bit.length; i++){
            if(!bit[i]){
                return false;
            }
        }
        return true;
    }
}
