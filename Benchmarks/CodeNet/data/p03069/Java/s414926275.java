import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int j=0;
        int x=0;
        for(int i=0;i<n;i++)
        {
           if(s.charAt(i)=='#')
           {
               x++;
           }
           else
           {
               j++;
           }
        }
        int d=Math.min(x, j);
        System.out.println(d);
    }
}
