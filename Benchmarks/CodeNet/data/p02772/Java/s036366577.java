//3で割り切れる：6,12,18,24,30,36,42,48,54,60,66,72,78,84,90,96
//5で割り切れる：10,20.30,40,50,60,70,80,90,100

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] array = new int[n];
        
        for(int i=0 ; i<n ; i++){
            array[i] = sc.nextInt();
        }
        
        for(int i=0 ; i<n ; i++){
            if(array[i]%2==0){
                if((array[i]%3!=0)&&(array[i]%5!=0)){
                    System.out.println("DENIED");
                    return;
                }
            }
        }
        
        System.out.println("APPROVED");
    }
}