import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        String ans="";

        if(N==0){
            
        }
        while(N!=0){
            if(N%2==0){   
                ans="0"+ans;
                N/=-2;
            }else{
                ans="1"+ans;
                N=(N-1)/(-2);
            }
        }
        if(ans.isEmpty()){
            System.out.println("0");
        }else{
            //ans.reverse();
            System.out.println(ans);
        }
    }
}