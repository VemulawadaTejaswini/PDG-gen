import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
     String[] s=line.split(" ",0);
      int n=Integer.parseInt(s[0]);
       int m=Integer.parseInt(s[1]);
      line = sc.nextLine();
      long a=0;
     String[] s1=line.split(" ",0);
      int num[]=new int[n];
      for(int i=0;i<n;i++){
      	num[i]=Integer.parseInt(s1[i]);
      }
      for(int i=0;i<n-1;i++){
        int ans=num[i];
        if((ans%=m)==0)a++;
      	for(int j=i+1;j<n;j++){
        	ans+=num[j];
          if((ans%=m)==0)a++;
        }
      }
      if((num[n-1]%m)==0)a++;
      System.out.println(a);
      
      
    }
}