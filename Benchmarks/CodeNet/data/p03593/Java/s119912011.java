
public class Main {

    public static void main(String[] args) {
     try{
         java.util.Scanner s1 = new java.util.Scanner(System.in);
         int n=s1.nextInt();
         int m=s1.nextInt();
         int a[]=new int[26];
         for(int i=0;i<n;i++)
         {
             String s=s1.next();
             int l=s.length();
             for(int j=0;j<l;j++)
                 a[s.charAt(j)-97]++;
         }
         int odd=0;
         for(int i=0;i<26;i++)
         {
             if(a[i]%2==1)
                 odd++;
         }
         int count=0;
         if(odd==1)
             System.out.println("Yes");
         else
         {
              if(odd==0)
              {
                  for(int i=0;i<26;i++)
                        if(a[i]!=0)
                            count++;
              }
              if(count%2==1)
                  System.out.println("Yes");
              else
                  System.out.println("No");
         }
         
     }
     catch(Exception e)
     {}
   }
}
