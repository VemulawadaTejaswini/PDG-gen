import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[3];
        int sum = 0;
        for(int i = 0;i < 3;i++){
            abc[i] = sc.nextInt();
            sum += abc[i];
        }
        Arrays.sort(abc);
        

        if(abc[2] == abc[1]+abc[0] || sum%2 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }