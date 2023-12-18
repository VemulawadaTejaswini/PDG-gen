import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt(),w=sc.nextInt(),k=sc.nextInt();
        String[] str=new String[h];
        for(int i=0;i<h;i++){
            str[i]=sc.next();
        }
        int count=1;
        boolean flag=false;
        for(int i=0;i<h;i++){
            flag=false;
            for(int j=0;j<w;j++){
                System.out.print(count);
                if(j<w-1){
                    System.out.print(" ");
                }
                if(j+1<w&&flag&&str[i].charAt(j+1)=='#')count++;
                if(str[i].charAt(j)=='#')flag=true;
            }
            count++;
            System.out.print("\n");
        }
    }
}