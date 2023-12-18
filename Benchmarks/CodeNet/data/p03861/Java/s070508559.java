import java.util.*;

public class Main {
    public static void main(String[] args)  {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int count=0;
        
        for(int i=a; i<=b; i++){
            if(i%x==0){
                count++;
            }
        }
    System.out.println(count);
        }catch(Exception e){
            System.out.println("オーバーフローに注意してください");
        }
        
    }
}