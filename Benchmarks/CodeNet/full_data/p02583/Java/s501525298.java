import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int temp;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
          temp=s.nextInt();
              
                  al.add(temp);
             
        }
        Collections.sort(al);
       
        int total=0;
        for(int i1=0;i1<n;i1++)
        {
            for(int j1=i1+1;j1<n;j1++)
            {
                for(int k1=j1+1;k1<n;k1++)
                {
                    if(  ((al.get(i1)+al.get(j1)) > al.get(k1) ) && (al.get(i1)!=al.get(j1) &&  al.get(j1)!=al.get(k1)) )
                    {
                        total++;
                        
                    }
                }
            }
        }
        System.out.println(total);
    

    }
}