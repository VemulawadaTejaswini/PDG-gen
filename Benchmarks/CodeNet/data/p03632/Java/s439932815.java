import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        boolean ans=false;
        for(int i=0;i<3;i++){
            if(a[i]>a[i+1]) ans=true;
        }
        Arrays.sort(a);
        if(ans) System.out.println(a[2]-a[1]);
        else System.out.println(0);
        
    }
}