

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        new Main().q1();
    }
    
    
    public void q1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int ni=0;
        int yon=0;
        int zero=0;
        
        for(int i = 0; i < n; i++) {
           long in = sc.nextLong();
           if(in%4==0){
               yon++;
           }else if(in %2 == 0){
               ni++;
           }else{
               zero++;
           }
        }

        //二の倍数は二個並べればOK
        //ni = ni%2;
        //zaroは4が同じ数以上あればOK
        if(zero > yon){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
        
        
    }
    
    
}

