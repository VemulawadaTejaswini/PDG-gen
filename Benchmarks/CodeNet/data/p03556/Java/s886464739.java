import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

       // double n = sc.nextDouble();
        int n = sc.nextInt();
        //int ans = (int)Math.sqrt(n);
        int ans = 0;

        for(int i = 0;i*i < n;i++){
           ans = i;
        }
        System.out.println(ans*ans);
    }
}