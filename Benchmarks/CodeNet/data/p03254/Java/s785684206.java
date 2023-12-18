import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int []num=new int[n];
      for(int i=0;i<n;i++){
      	num[i]=sc.nextInt();
      }
      Arrays.sort(num);
      int ans=0;
      for(int i=0;i<n;i++){
      	if(num[i]<=m){
        ans++;
          m-=num[i];
        }
      }
        System.out.println(ans);
    }
}