import java.util.*;
//System.out.println("")

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt(); 
        int d = sc.nextInt(); 
        int e = sc.nextInt(); 
        int f = sc.nextInt(); 
        double max = 0;
        int max_sugar = 0;
        int max_sum = 0;
        
        for(int s=0; 100*s*a<=f; s++){
            for(int t=0; 100*t*b<=f; t++){
                int meltable_sugar = (a*s + b*t) * e; 
                int sum_water = 100*s*a + 100*t*b;
                
                for(int u=0; u*c<=f; u++){
                    for(int v=0; v*d<=f; v++){
                        int sum_sugar = c*u + d*v;
                        int sum = sum_sugar + sum_water;
                        if(sum_sugar > meltable_sugar) continue;
                        if(sum > f) continue;
                        if(max < 100 * sum_sugar / (double)sum){
                            max = 100 * sum_sugar / (double)sum;
                            max_sugar = sum_sugar;
                            max_sum = sum;
                        }
                    }
                }
            }
        }
        System.out.println(max_sum +" "+ max_sugar);
    }
}