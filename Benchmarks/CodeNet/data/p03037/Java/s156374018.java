import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt();
        int gate = sc.nextInt();
        int[] l = new int[gate];
        int[] r = new int[gate];
        int ans = 0;

        for(int i = 0;i < gate;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for(int i = 1;i <= card;i++){
            boolean jud = true;
            for(int j = 0;j < gate;j++){
                if((l[j] > i)||(i > r[j])){
                    jud = false;
                    break;
                }
            }
            if(jud == true)
            ans++;
        }
        System.out.println(ans);

    }
}