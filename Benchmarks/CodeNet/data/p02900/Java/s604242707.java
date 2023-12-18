import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long wk_no1 = a < b ? a : b;
        long wk_no2 = a < b ? b : a;
      
        boolean tar_flg;
        int cont = 0;
       long tmp;
       while ((tmp = wk_no2 % wk_no1) != 0) {
            wk_no2 = wk_no1;
            wk_no1 = tmp;
        }
      
        for(long i = 1 ;i <= wk_no1 ; i++){
            tar_flg = true;
            if(a%i == 0 && b%i == 0){
                for(long m = 2 ; m < i ; m++){
                    if(i%m == 0){
                        tar_flg = false;
                        break;
                    } 
                }
                if(tar_flg) cont ++;
            }
        }

        System.out.println(cont);
        sc.close();
    }
}

