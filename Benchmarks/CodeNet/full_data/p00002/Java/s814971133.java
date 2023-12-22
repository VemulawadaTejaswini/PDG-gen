import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,wa;
        
        goback:
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            wa = a+b;
            int ue,shita;
            
            for(int i=1; i<10;i++){
                ue=10;
                shita=1;
                if((wa<ue)&&(wa>=shita)){
                    System.out.println(i);
                    continue goback;
                }else{
                    ue *=10;
                    shita *=10;
                }
            }
        }
    }
}