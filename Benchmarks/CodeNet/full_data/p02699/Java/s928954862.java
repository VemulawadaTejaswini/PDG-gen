import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int []cnt= new int[2019];
        int x=1;
        int  tat=0;
        long ans=0;
        long m =2019;
        int n=S.length();

        for(int i=S.length()-1;i>=0;i--)
        {
          int num=S.charAt(i)-'0';

          tat+=num*x%2019;
          cnt[tat%2019]++;
          x*=10;
        }

        for(int i=0;i<2019;i++)
        {if(cnt[i]!=1){


          ans+=(cnt[i]*(cnt[i]+1))/2;
            System.out.println((cnt[i]*(cnt[i]+1))/2);
          }
        }
        System.out.println(ans);
      }
    }