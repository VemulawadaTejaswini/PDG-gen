import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);

        int m[]=new int[50];
        int f[]=new int[50];
        int r[]=new int[50];
        int count=0;
        
        while(true){
        m[count]=sc.nextInt();
        f[count]=sc.nextInt();
        r[count]=sc.nextInt();
        if(m[count]+f[count]+r[count]==-3) break;
        count++;
        }
        
        for(int i=0;i<count;i++)
         if(m[i]==-1||f[i]==-1)
           System.out.println("F");
         else if(m[i]+f[i]>=80)
            System.out.println("A");
         else if(m[i]+f[i]>=65)
            System.out.println("B");
         else if(m[i]+f[i]>=50||m[i]+f[i]>=30&&r[i]>=50)
            System.out.println("C");
         else if(m[i]+f[i]>=30)
            System.out.println("D");
         else
            System.out.println("F");
}
}
