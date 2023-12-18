    import java.io.*;
    class Palin
    {
      public static void main()throws IOException
      {
        String s,s1="",s2="",s3="",s4="",s5=""; 
        int i,j=0,l,l1,l2;
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        s=input.readLine();
        l=s.length();
        l1=(l-1)/2;
        l2=(l+3)/2;
        s2=s.substring(0,l1);
        s3=s.substring(l2-1);
        for(i=0;i<l;i++)
        {
          if(j<l1)
          {
            s4=s2.charAt(j)+s4;
          }
          if(j<l2)
          {
            s5=s3.charAt(j)+s5;
          }
          s1=s.charAt(i)+s1;
          j++;
        }
        if(s.equals(s1) && s2.equals(s4) && s3.equals(s5))
          System.out.println("Yes");
        else
          System.out.println("No");
      }
    }