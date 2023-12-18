import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      int k=sc.nextInt();
      if(k%2==1){
      	System.out.println((n/k)*(n/k)*(n/k));
      }
      else{
        	while(k%4==0){
            	n/=2;
              k/=2;
            }
        int ans=n/(k/2);
        System.out.println((ans/2)*(ans/2)*(ans/2)+((ans+1)/2)*((ans+1)/2)*((ans+1)/2));
      }
    }
}