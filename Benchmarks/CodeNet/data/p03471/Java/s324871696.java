import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


public class Main{
   
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Y=sc.nextInt();
        int x=-1;
        int y=-1;
        int z=-1;
        for(int i=0;i<=Y/10000;i++){
            for(int j=0;j<=(Y-10000*i)/5000;j++){
                if((Y-10000*i-5000*j)/1000==N-i-j){
                    x=i;
                    y=j;
                    z=N-i-j;

                }
            }
        }
        System.out.println(x+" "+y+" "+z);


        
        

    }

        
        
    }
