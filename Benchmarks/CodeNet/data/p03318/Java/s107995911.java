import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int count=0;
        int index=0;
        int coeff=2;
        
        for(count=0;count<K;count++){
            System.out.println(coeff*(int)(Math.pow(10,index))-1);
            if(coeff==10){
                coeff=2;
                index++;
            }else{
                coeff++;
            }
        }
    } 
}