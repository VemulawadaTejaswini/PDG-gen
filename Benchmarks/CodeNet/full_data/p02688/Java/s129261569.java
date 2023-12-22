import java.util.*;

import javax.security.auth.kerberos.KerberosCredMessage;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] d = new int[k];
        int[][] ary = new int[k][n];
        int sum =0;
        int[] ary2 = new int[n*k];
        for(int i =0; i<k ; i++){
            d[i]= scan.nextInt();
            for (int j =0; j<d[i] ; j++){
                ary[i][j]= scan.nextInt();
            }
        }
        for (int i =1;i<=n;i++){
            if (!Arrays.asList(ary).contains(i)){
                sum = sum +1;
            }
            }
            System.out.println(sum);
            }
        }