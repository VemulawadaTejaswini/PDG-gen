import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int Q = sc.nextInt();
        
        long sum = 0;
        int[] list = new int[Q];
        int min = 2147483647;
        int num = 0;
        
        for (int index=0; index<Q; index++){
            if (sc.nextInt()==1){
                    
                    int temp = sc.nextInt();
                    
                    list[num]=temp;
                    
                    if (temp<min){
                        min=temp;
                    }
                
                num++;
                
                sum+= sc.nextInt();
            } else {
                
                System.out.print(min);
                long ans = 0;
                for (int index2=0; index2<num; index2++){
                    ans+=Math.abs(min-list[index2]);
                }
                ans+=sum;
                System.out.print(" ");
                System.out.println(ans);
            }
        }
    }
}